package garcia.luis.polymorphism;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class Pet
{
    private String name;
    private int age;

    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Pet(){}

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

    public  String speak()
    {
        return "arrrrrrrr";
    }

}
