package garcia.luis.polymorphism;

import garcia.luis.bankaccountmanager.SavingsAccount;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class Dog extends Pet
{
    private String name;
    private int age;

    @Override
    public String speak()
    {
        return  "woof woof";
    }
}
