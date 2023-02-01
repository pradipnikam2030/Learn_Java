package Com.Core_Java;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius");
        double rad=sc.nextInt();
        double Area=3.14*rad*rad;
        System.out.println("Area of Circle : "+Area);

    }
}
