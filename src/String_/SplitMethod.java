package String_;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String s1="you all are good student";
        char ch=' ';
        int count=0;
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)==ch)
                count++;
        }

        String[] sa=new String[count+1];
        String s2="";
        int index=0;
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)!=ch)
                s2=s2+s1.charAt(i);
            else {
                sa[index++] = s2;
                s2="";
            }
        }
        sa[index]=s2;
        System.out.println(Arrays.toString(sa));
    }
}
