package garcia.luis.polymorphism;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class Cat extends Pet
{
    private String name;
    private int age;

    @Override
    public String speak()
    {
        return "meow meow";
    }

}
