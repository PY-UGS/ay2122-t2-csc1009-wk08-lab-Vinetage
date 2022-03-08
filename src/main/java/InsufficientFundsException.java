/*---------------------------------------------*/
/*InsufficientFundsException Class*/
/*Extends Exception*/
/*---------------------------------------------*/
public class InsufficientFundsException extends Exception
{
    private double amount;
    public InsufficientFundsException(double amount)
    {
        this.amount = amount;
    }
    public double getAmount(){return this.amount;}
}
