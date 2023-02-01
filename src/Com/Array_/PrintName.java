package Com.Array_;
//Q.2. Take an array of names as input from the user and print them on the screen.


import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size  of an Array :");
        int  size=sc.nextInt();
        sc.nextLine();
        String [] names=new String[size];
        System.out.println("Enter the Names :");
// input
        for (int i=0; i< names.length; i++)
        {
           // Scanner s=new Scanner(System.in);
            names[i]=sc.nextLine();
        }
//        output
        for (int i=0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }

    }
}
