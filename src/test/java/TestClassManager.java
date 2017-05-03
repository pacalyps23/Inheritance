package garcia.luis.classmanager;

import org.junit.Test;
import org.junit.Assert;



/**
 * Created by luisgarcia on 5/2/17.
 */
public class TestClassManager
{
    Inventory myInv = new Inventory();
    //Product myProd = new Product();
    Product orange = new Product(1.2,1,55);

    @Test
    public void testSumOfProduct()
    {
        //given
        myInv.addProduct(orange);
        double expected = 1.2 * 55;
        //when
        double actual = myInv.sumOfProducts(orange);

        //then
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void testUpdateQuantity()
    {
        //given
        myInv.addProduct(orange);
        myInv.addProduct(orange);
        int expected = 110;

        //when
        double actual = orange.getQuantity();

        //then
        Assert.assertEquals(expected,actual,0);
    }

}
