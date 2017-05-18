package garcia.luis.polymorphisminterface;

import garcia.luis.polymorphism.Pet;

/**
 * Created by luisgarcia on 5/6/17.
 */
public class Dog extends Pets
{
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Dog(){}

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
        return "woof woof";
    }

}
