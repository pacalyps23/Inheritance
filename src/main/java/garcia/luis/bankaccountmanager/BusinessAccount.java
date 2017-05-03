package garcia.luis.bankaccountmanager;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class BusinessAccount extends Account
{
    private  static int id;
    private double balance;
    private String name;

    @Override
    public void withdraw(int amount)
    {
        if(maintainMin())
        {
            super.withdraw(amount);
        }
        else
        {
            System.out.println("Not enough money in Account");
        }
    }

    public boolean maintainMin()
    {
        if(super.getBalance() > 10000)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public void closeAccount()
    {
        id = 0;
        balance = -25;
        System.out.println(name + ", you have now closed your Business Account at a $25 dollar fee");

    }
}
