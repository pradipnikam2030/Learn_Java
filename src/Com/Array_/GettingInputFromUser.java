package Com.Array_;

import java.util.Scanner;

public class GettingInputFromUser {
    public static void main(String[] args) {
        System.out.println("Enter the Size of an Array : ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] numbers=new int[size];
        System.out.println("Enter the Array Element");

// input
        for (int i=0; i<size; i++)
        {
            numbers[i]=sc.nextInt();
        }
// output
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
