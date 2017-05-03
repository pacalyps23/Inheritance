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
        elCerro.addMoney(4344);
        System.out.println(elCerro.maintainMin());//check if wee can withdraw
        elCerro.addMoney(6663);
        elCerro.withdraw(100);///now we can withdraw
        System.out.println(elCerro.getBalance());


    }
}
