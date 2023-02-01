package Com.Core_Java;

import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the charcter");

        char ch=sc.next().charAt(0);
        {
            if (ch== 'a' || ch== 'e'  || ch== 'i' || ch=='o' || ch== 'u')
                System.out.println("The given character is Vowel");
            else if (ch=='A' || ch== 'E' || ch== 'O' || ch=='U' || ch== 'I')
            System.out.println("Ther given Character is Vowel");
            else
//                throw new IllegalStateException("Unexpected value: " + ch);
            System.out.println("Ther given Character is Consonant");
        }

    }
}
