package Com.Core_Java;

import java.util.Scanner;

public class AreaOfEquirateralTringle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of side");
        double side= sc.nextDouble();
        double area=Math.sqrt(3)/4*(side*side);
        System.out.println("Area of Equirateral Tringle : "+area);


    }
}
