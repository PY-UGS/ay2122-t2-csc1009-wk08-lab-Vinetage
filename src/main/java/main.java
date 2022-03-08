/*---------------------------------------------*/
/*Lab Main*/
/*---------------------------------------------*/

//Library import
import java.util.Scanner;

public class main
{
    //region Main
    public static void main(String[] args)
    {
        //Main codes goes here
        System.out.println("Hello This is week 08");
        Question_01();
        Question_02();
    }
    //endregion

    //region Question 01
    static void Question_01()
    {
        //System in to take in input
        Scanner input = new Scanner(System.in);
        //Default Circle Print
        CircleWithException circle = new CircleWithException();
        System.out.println("This is Question 01 of Week 08 Lab");

        while(!circle.done)
        {
            System.out.print("Enter a radius: ");
            double rad = 0;
            try
            {
                //Try to input radius
                rad = input.nextDouble();
                circle.setRadius(rad);
                System.out.println("Area is: " + circle.getArea());
            }
            catch (java.util.InputMismatchException | IllegalArgumentException e)  //If input does not match datatype
            {
                //Clear input buffer
                input.nextLine();
                System.out.println(e);
            }
        }

    }
    //endregion

    //region Quesiton 02
    static void Question_02()
    {
        BankTest test = new BankTest("123456",0);
        test.StartBank();
    }
    //endregion
}
