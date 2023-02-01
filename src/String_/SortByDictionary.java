package String_;

import java.util.Arrays;

public class SortByDictionary {
    public static void main(String[] args) {
        String s="i am too much stupid guy z";
        String[] sa=s.split(" ");
        System.out.println(Arrays.toString(sa));
        for (int i=0; i<sa.length; i++)
        {
            for (int j=i+1; j<sa.length; j++)
            {
                if (sa[i].compareToIgnoreCase(sa[j])>0)
                {
                    String temp=sa[i];
                    sa[i]=sa[j];
                    sa[j]=temp;
                }
            }
            System.out.println(sa[i]);
        }
       // for (String temp:sa)
          //  System.out.print(temp+" ");
    }
}
