package String_;

import java.util.Arrays;

public class toCharArray {
    public static void main(String[] args) {
        String s1="Pradip Nikam";
     char[]a= myToCharArray(s1);
        System.out.println(Arrays.toString(a));
    }

    private static char[] myToCharArray(String s1) {
        char[] a=new char[s1.length()];
        for (int i=0; i<s1.length(); i++)
        {
            a[i]=s1.charAt(i);
        }
        return a;
    }
}
