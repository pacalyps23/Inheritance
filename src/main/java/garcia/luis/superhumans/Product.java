package garcia.luis.superhumans;

/**
 * Created by luisgarcia on 5/2/17.
 */
public class Product
{
    private double price;
    private int id;
    private int quantity;

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
