package garcia.luis.polymorphisminterface;

import garcia.luis.polymorphism.Pet;

import java.util.Comparator;

/**
 * Created by luisgarcia on 5/6/17.
 */
abstract class Pets implements Comparable<Pets>, Comparator<Pets>
{

    abstract void setName(String name);

    abstract String getName();

    abstract void setAge(int age);

    abstract int getAge();

    abstract String speak();

    public int compareTo(Pets p)
{
    if(!this.getName().equals(p.getName()))
    {
        return this.getName().compareTo(p.getName());
    }
    else
    {
        return this.getClass().getName().compareTo(p.getClass().getName());
    }
}

    @Override
    public int compare(Pets p1, Pets p2)
    {
        if(p1.getClass().equals(p2.getClass()));
        {
            return compare(p1, p2);
        }

    }

}
