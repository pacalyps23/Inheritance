package garcia.luis.polymorphism;

import java.util.*;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class UserInput
{ // class user input

    ArrayList<Pet> petList = new ArrayList<Pet>();

    private int num;
    private String petType;
    private String petName;



    public void createPets()
    {
        num = Integer.parseInt(getSringFromUser("How many pets do you have?")); //ask question

        for (int i = 0; i < num; i++)
        {
            petType = getSringFromUser("What kind of pet is pet #" + (i+1) + "?");//save petType input
            petName = getSringFromUser("What is the name of pet #" + (i+1) + "?");//save name of pet
            petList.add(matchPet(petType));//add pet from list
            petList.get(i).setName(petName);//add name for pet
        }
    }

        public Pet matchPet (String petType) //create pets to add
        {
            //Pet pet;
            switch (petType.toLowerCase())
            {
                case "dog":
                    Dog dog = new Dog();//create dog
                    return dog;



                case "cat":
                    Cat cat = new Cat();//creat cat
                    return cat;



                case "snake":
                    Snake snake = new Snake();
                    return snake;


                default:
                    Pet pet = new Pet();
                    return pet;

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










