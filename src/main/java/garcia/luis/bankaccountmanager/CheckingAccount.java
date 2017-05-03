package garcia.luis.bankaccountmanager;

/**
 * Created by luisgarcia on 5/2/17.
 */
public class CheckingAccount extends Account
{
    private static int id;
    private double balance;
    private String name;

    public void closeAccount()
    {
        id = 0;
        balance = 0;//return full amount to user
        System.out.println(name + ", you Have now closed your checking account at no cost");
    }

}
