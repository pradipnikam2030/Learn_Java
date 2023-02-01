package Com.Core_Java;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Three Number");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        if(num1>num2 && num1>num3)
            System.out.println(num1);
        else if (num2>num1 && num2>num3)
            System.out.println(num2);
        else if(num3>num1 && num3>num2)
            System.out.println(num3);
        else
            System.out.println("Error404\nplese try again");
    }
}
