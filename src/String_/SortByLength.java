package String_;

import java.util.Arrays;

public class SortByLength {
    public static void main(String[] args) {
        String s1="Pradip is very talendted boy";
        String[] sa=s1.split(" ");
        for (int i=0; i<sa.length; i++)
        {
            for (int j=i+1; j< sa.length; j++)
            {
                if (sa[j].length()<sa[i].length()) {
                    String temp = sa[i];
                    sa[i] = sa[j];
                    sa[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(sa));
    }
}
