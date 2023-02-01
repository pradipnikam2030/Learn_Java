package Com.Core_Java;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length and width");
        double length=sc.nextInt();
        double width=sc.nextInt();
        double area=length*width;
        System.out.println("Area Of Rectangle : "+area);



    }
}
