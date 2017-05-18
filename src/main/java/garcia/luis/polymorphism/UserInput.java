package garcia.luis.polymorphism;

import java.util.*;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class UserInput
{

    ArrayList<Pet> petList = new ArrayList<Pet>();

    private int num;
    private String petType;
    private String petName;



    public void createPets()
    {
        num = Integer.parseInt(getStringFromUser("How many pets do you have?")); //ask question

        for (int i = 0; i < num; i++)
        {
            petType = getStringFromUser("What kind of pet is pet #" + (i+1) + "?");//save petType input
            petName = getStringFromUser("What is the name of pet #" + (i+1) + "?");//save name of pet
            petList.add(matchPet(petType));//add pet from list
            petList.get(i).setName(petName);//add name for pet
        }
    }

        public Pet matchPet (String petType) //create pets to add
        {
            Pet pet;
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
                    pet = new Pet();
                    return pet;

            }

        }

        public String getStringFromUser(String input)
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










