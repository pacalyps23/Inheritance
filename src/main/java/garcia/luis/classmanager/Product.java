package garcia.luis.classmanager;

/**
 * Created by luisgarcia on 5/2/17.
 */
public class Product
{
    private double price;
    private int id = 0;
    private int quantity;

    public Product()
    {
    }

    public Product(double price, int id, int quantity)
    {
        this.price = price;
        this.id = id;
        this.quantity = quantity;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    public int getQuantity()
    {
        return quantity;
    }
}
