package garcia.luis.classmanager;

import java.util.ArrayList;

/**
 * Created by luisgarcia on 5/2/17.
 */
public class Inventory {
    ArrayList<Product> myInventory = new ArrayList();

    public void addProduct(Product product)
    {
        //if not in list add it
        if (!isIdFound(product))
        {
            myInventory.add(product);
        }
    }

    public boolean isIdFound(Product productToCheck)
    {
        for (int i = 0; i < myInventory.size(); i++)
        {
            Product currentProduct = myInventory.get(i);
            if (currentProduct.getId() == productToCheck.getId())
            {
                //update quantity if it is already in list
                int x = currentProduct.getQuantity();
                int y = productToCheck.getQuantity();
                currentProduct.setQuantity(x+y);
                return true;
            }
        }
        return false;
    }

    public double sumOfProducts(Product product)
    {
        double price = product.getPrice();
        double quantity = product.getQuantity();
        return price * quantity;
    }

    public double sumOfAllProducts()
    {
        double sum = 0;
        for(int i = 0; i < myInventory.size(); i++)
        {
            sum = sum + sumOfProducts(myInventory.get(i));

        }
        return sum;
    }


    public void printInventory()
    {
        for(int i = 0; i < myInventory.size(); i++)
        {
            System.out.println("ID: " + myInventory.get(i).getId());
            System.out.println("Price: $" + myInventory.get(i).getPrice());
            System.out.println("Quantity: " + myInventory.get(i).getQuantity());
            System.out.println("Sum: $" + sumOfProducts(myInventory.get(i)));
            System.out.println("Sum of Inventory: $" + sumOfAllProducts());
            System.out.println();
        }
    }

}
