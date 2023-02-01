package String_;

import java.util.Arrays;

public class ReverseString4 {
    public static void main(String[] args) {
        String s1="you are very dumb";
        String [] sa=s1.split(" ");
        int start=0;
        int end=sa.length-1;
        while (start<end)
        {
            String temp=sa[start];
            sa[start]=sa[end];
            sa[end]=temp;
            start++;
            end--;
        }
        for (int i=0; i<sa.length; i++)
        {
            String temp=sa[i];
            String s2="";
            for (int j=temp.length()-1; j>=0; j--)
            {
                s2+=temp.charAt(j);
            }
            sa[i]=s2;
        }
        System.out.println(Arrays.toString(sa));
    }
}
