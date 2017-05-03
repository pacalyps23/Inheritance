import garcia.luis.bankaccountmanager.Account;
import garcia.luis.bankaccountmanager.BusinessAccount;
import garcia.luis.bankaccountmanager.CheckingAccount;
import garcia.luis.bankaccountmanager.SavingsAccount;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class TestATM
{
    BusinessAccount bob = new BusinessAccount();
    CheckingAccount bob2 = new CheckingAccount();
    SavingsAccount bob3 = new SavingsAccount();

    @Test
    public void testBusinessAddMoney()
    {
        //given
        bob.createAccount(1, "ZipCode");
        bob.addMoney(5000);
        bob.addMoney(50);
        double expected = 5050;

        //when
        double actual = bob.getBalance();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testBusinessMaintainMin()
    {
        //given
        bob.createAccount(1, "ZipCode");
        bob.addMoney(5000);
        bob.withdraw(50);
        double expected = 5000;

        //when
        double actual = bob.getBalance();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testBusinessWithdraw()
    {
        //given
        bob.createAccount(1, "ZipCode");
        bob.addMoney(23456);
        bob.withdraw(10000);
        double expected = 13456;

        //when
        double actual = bob.getBalance();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testCheckingWithdraw()
    {
        //given
        bob2.createAccount(1, "Bob Fuller");
        bob2.addMoney(8555);
        bob2.withdraw(10000);
        double expected = -1445;

        //when
        double actual = bob2.getBalance();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSavingsWithdraw()
    {
        //given
        bob3.createAccount(1, "Paco Garcia");
        bob3.addMoney(23456);
        bob3.withdraw(10000);
        double expected = 13456;

        //when
        double actual = bob3.getBalance();

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testSavingInterest()
    {
        //given
        bob3.createAccount(1, "Paco Garcia");
        bob3.addMoney(23456);
        double expected = 117.28;

        //when
        double actual = bob3.interestEarned();

        //then
        Assert.assertEquals(expected, actual, 0);
    }




}
