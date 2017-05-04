package garcia.luis.polymorphism;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class Snake extends Pet
{
    private String name;
    private int age;

    @Override
    public String speak()
    {
       return "zzzzzzzzzzzzzz";
    }
}
