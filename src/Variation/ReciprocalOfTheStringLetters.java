package Variation;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
public class ReciprocalOfTheStringLetters {

        static void Reciprcalstring (String word)
        {
            char ch;
            for (int i = 0; i < word.length(); i++) {
                ch = word.charAt(i);

                // Checking if the character
                // is a letter or not
                if (Character.isLetter(ch)) {

                    // converting lowercase character
                    // To reciprocal character
                    if (Character.isLowerCase(ch)) {
                        ch = (char) (122 - (int) (ch) + 97);
                    }
                    // converting uppercase character
                    // To reciprocal character
                    else if (Character.isUpperCase(ch)) {
                        ch = (char) (90 - (int) (ch) + 65);
                    }
                }

                // display each character
                System.out.print(ch);
            }
        }

        // Driver function
        public static void main (String[]args)
        {
            // static input
            String s = "abc";
            System.out.print("The reciprocal of " + s + " is - "
                    + "\n");

            // calling the function
            Reciprcalstring(s);
        }


}
