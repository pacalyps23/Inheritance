package garcia.luis.bankaccountmanager;

/**
 * Created by luisgarcia on 5/2/17.
 */
public class SavingsAccount extends Account
{
    private static int id;
    private double balance;
    private String name;

    public double interestEarned()
    {
        double val = super.getBalance();
        val = val * .005;
        super.addMoney(val);
        return  val;
    }

    public void closeAccount()
    {
        id = 0;
        balance = -5;
        System.out.println(name + ", you have now closed your savings account at a $5 fee.");
    }
}
