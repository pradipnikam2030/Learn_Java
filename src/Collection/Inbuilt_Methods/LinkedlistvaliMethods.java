package Collection.Inbuilt_Methods;

import java.util.*;
import java.lang.reflect.*;
public class LinkedlistvaliMethods {
    public static void main(String[] args)
    {
//inheri.10
        Count t = new Count();
        t.count();
    }
}
class Count extends Count2
{
    Count()
    {
    }
}
class Count2
{
    void count()
    {
        System.out.print("Output = ");
        for (int x = 0; x < 7; x++,x++ )
        {
            System.out.print(" " + x);
        }
    }


}


// OutPut
//[1, 2, 4, 5, 6, 7]
//[8, 9, 10]