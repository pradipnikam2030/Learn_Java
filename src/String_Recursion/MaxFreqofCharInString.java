package String_Recursion;

import java.util.Arrays;

public class MaxFreqofCharInString {
    public static void main(String[] args) {
        String s1="Praadip";
        char ch=' ';
        int max=0;
       String[] a=new  String[2];
       a= iLoop(s1, ch, 0, max,a);
        System.out.println(Arrays.toString(a));

    }

    private static String[] iLoop(String s1, char ch, int i, int max, String[] a) {
        if (i<s1.length())
        {
            int count=getCount(s1, i, 0,0);

            if (count>max)
            {
                max=count;
                ch=s1.charAt(i);
            }
           return iLoop(s1, ch, ++i,max,a);
        }
        a[0]=max+"";
        a[1]=ch+"";
        return a;

    }

    private static int getCount(String s1,int i, int j, int count) {
        if (j<s1.length())
        {
            if (s1.charAt(i)==s1.charAt(j))
                count++;
            return getCount(s1, i, ++j , count);
        }
        return count;
    }
}
