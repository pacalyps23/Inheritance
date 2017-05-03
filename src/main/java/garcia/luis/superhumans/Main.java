package garcia.luis.superhumans;

/**
 * Created by luisgarcia on 5/1/17.
 */

public class Main
{
    public static void main(String [] args)
    {
        SuperHuman paco = new SuperHuman();
        Human bob = new Human("Bob", 23, Gender.MALE, "Nerd", "1104 N Market St");
        SuperHuman jade = new SuperHuman("Jade", 44, Gender.FEMALE, "Waitress", "22 Saucy Rd", Personality.BAD, "JUnit", "Single Reponsibility");

        paco.setName("Paco");
        paco.setAge(31);
        paco.setGender(Gender.MALE);
        paco.setOccupation("Programmer");
        paco.setAddress("513 17th Ave N");
        paco.setHeroName("Sponger");
        paco.setPersonality(Personality.GOOD);
        paco.setSuperAbility("Bad ass motherfucker!");



        paco.printHuman();
        jade.printHuman();
        bob.printHuman();



    }

}
