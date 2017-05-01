package garcia.luis.rotatearray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by luisgarcia on 5/1/17.
 */
public class Main
{
    public static void main(String [] args)
    {
        Rotate myList = new Rotate();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        System.out.println(myList);
        myList.rotator(2, myList);
        System.out.println(myList);

    }
}
