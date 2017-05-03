package garcia.luis.bankaccountmanager;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class ATM
{
    public static void main(String[] args)
    {
        BusinessAccount elCerro = new BusinessAccount();
        Account paco = new CheckingAccount();
        SavingsAccount bob = new SavingsAccount();

        elCerro.createAccount(1, "El Cerro");

    }
}
