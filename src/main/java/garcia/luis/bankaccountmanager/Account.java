package garcia.luis.bankaccountmanager;

/**
 * Created by luisgarcia on 5/2/17.
 */
public abstract class Account
{
    public abstract void closeAccount();
    private static int id;
    private int balance;
    private String name;
    ;
    public void createAccount(int id, String name)
    {
        this.name = name;
        this.id = id;
        balance = 0;

    }

    public double getBalance()
    {
        return balance;
    }

    public void addMoney(double amount)
    {
        balance += amount;
    }

    public void withdraw(int amount)
    {
        balance -= amount;
    }


}
