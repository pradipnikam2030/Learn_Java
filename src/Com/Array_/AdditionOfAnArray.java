package Com.Array_;

import java.util.Scanner;

public class AdditionOfAnArray {
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
      // Addition and multiplication of an Array...
        int sum=0, mul=1, avg=1;
        for (int i=0; i<numbers.length; i++)
        {
            sum=sum+numbers[i];
            mul=mul*numbers[i];
            avg=sum/ numbers.length;

        }
        System.out.println("Addition of an Array :"+sum);
        System.out.println("Multiplication of an Array :"+mul);
        System.out.println("Avarage of an Array :"+avg);
    }
}
