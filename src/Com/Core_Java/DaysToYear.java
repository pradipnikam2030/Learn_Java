package Com.Core_Java;

import java.util.Scanner;

public class DaysToYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int year=num/365;
        int rem1=num%365;
        System.out.println("Year : "+year);
        int month=rem1/30;
        System.out.println("Months : "+month);
        int rem2=rem1%30;
        int weeks=rem2/7;
        int rem3=weeks%7;
        System.out.println("Weeks : "+weeks);
        int days=rem2%7;
        System.out.println("days : "+days);
    }
}
