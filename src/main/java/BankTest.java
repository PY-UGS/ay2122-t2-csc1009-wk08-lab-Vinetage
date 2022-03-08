/*---------------------------------------------*/
/*Bank Java class*/
/*---------------------------------------------*/
import java.util.Scanner;
public class BankTest
{
    //To take in user input
    Scanner input = new Scanner(System.in);

    //Container to keep money
    private double balance = 0;
    private String accountNumber = "";

    //Constructor
    public BankTest(){}
    //Constructor overloaded
    public BankTest(String accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //Getter
    public String getAccountNumber(){return this.accountNumber;}
    public double getBalance(){return this.balance;}


    //Bank functions
    public void deposit(double deposit)
    {
        this.balance += deposit;
    }
    public void withdrawl(double amount) throws InsufficientFundsException
    {
        if(amount > this.balance)
            throw new InsufficientFundsException(amount);
        else
            balance -= amount;
    }

    //Start of bank operations
    public void StartBank()
    {
        System.out.println("--------------------------------------");
        System.out.println("Welcome to question 02 Bank!!!");
        System.out.println("--------------------------------------");

        while (true)
        {
            System.out.println("--------------------------------------");
            System.out.println("Welcome: " + getAccountNumber());
            System.out.println("Balance: " + getBalance());
            System.out.println("1 - Deposit Money");
            System.out.println("2 - Withdraw Money");
            System.out.println("3 - Exit Demo");
            System.out.println("--------------------------------------");

            System.out.print("Enter Number: ");
            int choice = 3;
            //Catch user inputs
            try
            {
                choice = input.nextInt();
            }
            catch (java.util.InputMismatchException e)
            {
                input.nextLine();
                System.out.println("Invalid input");
                continue;
            }

            //If else choices
            if(choice == 1)
            {
                while(true)
                {
                    double monies = 0;
                    try
                    {
                        System.out.print("Input amount to deposit: ");
                        monies = input.nextDouble();
                    }
                    catch (java.util.InputMismatchException e)
                    {
                        input.nextLine();
                        System.out.println("Invalid input");
                        continue;
                    }
                    deposit(monies);
                    break;
                }
            }
            else if (choice == 2)
            {
                while(true)
                {
                    double monies = 0;
                    try
                    {
                        System.out.print("Input amount to withdraw: ");
                        monies = input.nextDouble();
                    }
                    catch (java.util.InputMismatchException e)
                    {
                        input.nextLine();
                        System.out.println("Invalid input");
                        continue;
                    }

                    try
                    {
                        withdrawl(monies);
                        System.out.println("Success withdrawal of: " + monies);
                        System.out.println("Balanace: " +this.balance);
                    }
                    catch (InsufficientFundsException e)
                    {
                        System.out.println("Not enough Monies: " + e);
                        System.out.println("Balanace: " +this.balance);
                        System.out.println("Lacking: " + Math.abs(this.balance - monies));
                    }
                    break;
                }
            }
            else
            {
                break;
            }
        }
    }

}
