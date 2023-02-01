package String_;

import java.sql.SQLOutput;

//5) Write a program to get the character at the given index within theString
public class Question5 {
    public static void main(String[] args) {
        String s1="Hefshie";
        int index=4;
        char[] c=s1.toCharArray();
        if (index>s1.length())
            System.out.println("index out of bond");
        else
            System.out.println(c[index]);
    }
}
