
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/5/13 0013.
 */
public class Temp
{
    public static void main(String[] args){
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        /*Collections.sort(names, new Comparator<String>()
        {
            @Override
            public int compare(String a, String b)
            {
                return b.compareTo(a);
            }
        });*/

        Collections.sort(names,(String a,String b)->{
            return b.compareTo(a);
        });

    }





}
