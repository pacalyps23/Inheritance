package garcia.luis.polymorphism;

import java.util.*;

/**
 * Created by luisgarcia on 5/3/17.
 */
public class UserInput
{
    public static void main(String[] args)
    {



        Scanner input = new Scanner(System.in);
        ArrayList <String> nameList = new ArrayList<String>();
        ArrayList <String> typeList = new ArrayList<String>();
        int num;
        String petType;
        String petName;

        System.out.println("How many pets do you have?");
        num = input.nextInt();

        for (int i = 1; i <= num; i++)
        {
            System.out.println("What kind of pet is pet #" + i + "?");
            petType = input.next();
            System.out.println("What is the name of pet #" + i + "?");
            petName = input.next();

            typeList.add(petType);
            nameList.add(petName);
        }

        for(int i = 1; i <= nameList.size(); i++)
        {
            System.out.println("Pet #" + i +" Type: " + typeList.get(i) + ": Name: " + nameList.get(i));

        }

    }


}
