package garcia.luis.polymorphisminterface;

/**
 * Created by luisgarcia on 5/6/17.
 */
public class Cat implements Pet
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Cat(){}

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
        return "meow meow";
    }
}
