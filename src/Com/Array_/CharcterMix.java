package Com.Array_;

import java.util.Arrays;

//Given 2 character arrays s1 and s2 and another empty character array s3. Populate s3 by interleaving characters
//from both s1 and s1(Mindstix) (Variations)
public class CharcterMix {
    public static void main(String[] args) {
        char a[]={'a','b','c','d','e'};
        char []b={'x','y','w','z'};
        int cindex=0;
       char c[]=new char[a.length+b.length];
       for (int i=0; i<a.length||i<b.length;i++)
       {

           if (i<a.length)
               c[cindex++]=a[i];
           if(i<b.length)
               c[cindex++]=b[i];
       }
        System.out.println(Arrays.toString(c));
    }
}
