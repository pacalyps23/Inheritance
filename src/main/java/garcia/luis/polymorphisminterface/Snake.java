package garcia.luis.polymorphisminterface;

/**
 * Created by luisgarcia on 5/6/17.
 */
public class Snake extends Pets
{
    private String name;
    private int age;

    public Snake(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Snake(){}

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public String speak()
    {
        return "zzzzzzzzzzzzzz";
    }

}
