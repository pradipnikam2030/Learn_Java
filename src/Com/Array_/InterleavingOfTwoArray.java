package Com.Array_;

import java.util.Arrays;

public class InterleavingOfTwoArray {
    public static void main(String[] args) {
        char[] a= {'a','b','c','d','e','f','g'};
        char[] b= {'w','x','y','z'};
        char[] c= new char[a.length + b.length];
        int index=0;
        for (int i=0; i<a.length||i<b.length; i++)
        {
            if (i<a.length)
                c[index++]=a[i];
            if (i<b.length)
                c[index++]=b[i];

        }
        System.out.println(Arrays.toString(c));
    }
}
