package garcia.luis.bankaccountmanager;

/**
 * Created by luisgarcia on 5/2/17.
 */
public abstract class Account
{
    public abstract void closeAccount(int id);
    private static int id;
    private int balance;
    ;
    public void createAccount(int id)
    {
        this.id = id;
        balance = 0;

    }

    public double getBalance()
    {
        return balance;
    }

    public void addMoney(int amount)
    {
        balance += amount;
    }

    public void withdraw(int amount)
    {
        balance -= amount;
    }


}
