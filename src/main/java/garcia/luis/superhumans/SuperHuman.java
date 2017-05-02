package garcia.luis.superhumans;

/**
 * Created by luisgarcia on 5/1/17.
 */
public class SuperHuman extends Human
{

    private Personality personality;
    private String heroName;
    private String superAbility;

    public SuperHuman()
    {

    }

    public SuperHuman(String name,int age, Gender gender, String occupation, String address, Personality personality, String heroName, String superAbility)
    {
        super.setName(name);
        super.setAge(age);
        super.setGender(gender);
        super.setOccupation(occupation);
        super.setAddress(address);
        this.personality = personality;
        this.heroName = heroName;
        this.superAbility = superAbility;
    }

    public void setPersonality(Personality personality)
    {
        this.personality = personality;
    }

    public Personality getPersonality()
    {
        return personality;
    }

    public void setHeroName(String heroName)
    {
        this.heroName = heroName;
    }

    public String getHeroName()
    {
        return heroName;
    }

    public void setSuperAbility(String superAbility)
    {
        this.superAbility = superAbility;
    }

    public String getSuperAbility()
    {
        return superAbility;
    }

    public void printHuman()
    {
        super.printHuman();
        System.out.println("Personality: " + getPersonality());
        System.out.println("Hero Name: " + getHeroName());
        System.out.println("Super Ability: " + getSuperAbility());
        System.out.println();
    }


}
