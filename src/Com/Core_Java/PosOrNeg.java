package Com.Core_Java;

import java.util.Scanner;

public class PosOrNeg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        int num= sc.nextInt();
        if (num==0)
            System.out.println("zero");
        else if (num>0)
            System.out.println("Positive");
        else if(num<0)
            System.out.println("Negative");
        else
            System.out.println("enter valide number");

    }
}
