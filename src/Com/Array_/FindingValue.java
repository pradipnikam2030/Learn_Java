package Com.Array_;

// Que.1. Take an array as input from the user. Search for a given number x and print the index at which occurs..

import java.util.Scanner;

public class FindingValue {
    public static void main(String[] args) {
        System.out.println("Enter Size of an Array :");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        System.out.println("Enter the Element of an Array :");
        int[] numbers=new int[size];
        for (int i=0; i<size; i++)
        {
            numbers[i]= sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x= sc.nextInt();
        for (int i=0; i<numbers.length; i++)
        {
            if (x==numbers[i])
            System.out.println("X is found at the index: "+i);
        }
    }
}
