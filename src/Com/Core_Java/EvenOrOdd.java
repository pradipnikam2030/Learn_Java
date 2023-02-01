package Com.Core_Java;
import java.util.Scanner;


public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if(num==0)
            System.out.println("number is zero");
        else if (num%2== 0) {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Number is odd");
        }

    }
}


