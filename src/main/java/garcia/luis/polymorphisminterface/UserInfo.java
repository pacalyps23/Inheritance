package garcia.luis.polymorphisminterface;
import java.util.*;

/**
 * Created by luisgarcia on 5/6/17.
 */
public class UserInfo
{
    ArrayList<Pets> petList = new ArrayList<Pets>();

    private int num;
    private String petType;
    private String petName;



    public void createPets()
    {
        num = Integer.parseInt(getSringFromUser("How many pets do you have?")); //ask question

        for (int i = 0; i < num; i++)
        {
            petType = getSringFromUser("What kind of pet is pet #" + (i+1) + "?");//save petType input
            petList.add(matchPet(petType));//add pet from listt
            petName = getSringFromUser("What is the name of pet #" + (i+1) + "?");//save name of pet
            petList.get(i).setName(petName);//add name for pet
        }
    }

    public Pets matchPet (String petType) //create pets to add
    {
        Pets pet;
        switch (petType.toLowerCase())
        {
            case "dog":
                pet = new Dog();//create dog
                return pet;



            case "cat":
                pet = new Cat();//creat cat
                return pet;



            case "snake":
                pet = new Snake();
                return pet;


            default:
                petType = getSringFromUser("Not valid choice. What kind of pet is it?");
                return matchPet(petType);
        }

    }

    public String getSringFromUser(String input)
    {
        Scanner in = new Scanner(System.in);
        System.out.println(input);
        String userInput = in.next();
        return userInput;
    }

    public void printPets()
    {
        for(int i = 0; i < petList.size(); i++)
            System.out.println("My pet " + petList.get(i).getName()
                    + " says " + petList.get(i).speak() + ".");

    }
}
