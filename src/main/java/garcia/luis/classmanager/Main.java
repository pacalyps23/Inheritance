package garcia.luis.classmanager;

/**
 * Created by luisgarcia on 5/2/17.
 */

public class Main
{
    public static void main(String [] args)
    {
        Inventory myStore = new Inventory();
        Product orange = new Product(1.25,1, 233);
        Product apples = new Product(1.33, 2, 432);
        Product peaches = new Product(1.58, 3, 222);

        myStore.addProduct(orange);
        myStore.addProduct(apples);
        myStore.addProduct(peaches);
        myStore.addProduct(orange);

        myStore.printInventory();


    }
}
