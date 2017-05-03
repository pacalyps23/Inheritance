package garcia.luis.bankaccountmanager;

import org.junit.Test;
import org.junit.Assert;

/**
 * Created by luisgarcia on 5/2/17.
 */
public class TestAccount
{
    Account paco = new CheckingAccount();

    @Test
    public void testInheritance()
    {
        //given
        paco.addMoney(10);
        double expected = 10;

        //when
        double actual = paco.getBalance();

        //then
        Assert.assertEquals(expected, actual, 0);
    }


}
