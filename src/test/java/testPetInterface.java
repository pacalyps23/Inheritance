import garcia.luis.polymorphisminterface.*;
import org.junit.Test;
import org.junit.Assert;


/**
 * Created by luisgarcia on 5/6/17.
 */
public class testPetInterface
{
    UserInfo tester = new UserInfo();
    Dog dog = new Dog();
    Cat cat = new Cat();
    Snake snake = new Snake();

    @Test
    public void testDog()
    {
        //given
        String expected = "woof woof";

        //when
        String actual = dog.speak();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCat()
    {
        //given
        String expected = "meow meow";

        //when
        String actual = cat.speak();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSnake()
    {
        //given
        String expected = "zzzzzzzzzzzzzz";

        //when
        String actual = snake.speak();

        //then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testDogSetter()
    {
        //given
        dog.setName("Snoop");
        String expected ="Snoop";

        //when
        String actual = dog.getName();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCatSetter()
    {
        //given
        cat.setName("Katy");
        String expected ="Katy";

        //when
        String actual = cat.getName();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSnakeSetter()
    {
        //given
        snake.setName("Jake");
        String expected ="Jake";

        //when
        String actual = snake.getName();

        //then
        Assert.assertEquals(expected, actual);
    }
}
