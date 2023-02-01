package String_;

import java.util.Arrays;

public class ReverseString2 {
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
        System.out.println(Arrays.toString(sa));
        String s3="";
        for (int i=0; i<sa.length; i++)
        {
           if (i<sa.length-1)
               s3+=sa[i]+" ";
           else
               s3+=sa[i];
        }
        System.out.println(s3);
    }
}
