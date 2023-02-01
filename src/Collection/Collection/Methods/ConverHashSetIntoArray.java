package Collection.Collection.Methods;

import java.util.Arrays;
import java.util.HashSet;

public class ConverHashSetIntoArray {
    private static Object TreeMap;

    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        int[] a=new int[hs.size()];
        a=myCode(hs,a);
        System.out.println(Arrays.toString(a));
    }
    //EndOfMainMethod
    public static int[] myCode(HashSet<Integer> hs, int[] a)
    {
        int index=0;
        for(Integer data:hs)
            a[index++]=data;
        return a;
    }
}
