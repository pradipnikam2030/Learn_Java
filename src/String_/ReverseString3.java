package String_;

import java.util.Arrays;

public class ReverseString3 {
    public static void main(String[] args) {
        String s1="samaj me aaya kya?";
                String[] sa=s1.split(" ");
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
