package garcia.luis.rotatearray;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by luisgarcia on 5/1/17.
 */
public class Rotate extends ArrayList
{

    public void rotator (int index, Rotate list)
    {
        Object temp;
        Object temp2;
        for(int i = 1; i <= index; i++)
        {
            temp = list.get(list.size()-i);
            temp2 = list.get(index-i);

            list.set(list.size()-i,temp2);
            list.set(index-i, temp);

        }
    }


}
