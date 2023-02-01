package Com.Core_Java;


import java.util.Scanner;

public class IncrementByOne {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        ++num;
        System.out.println(num);
    }

}
