package Recursion;

public class SumofNaturalNum {
    public static void main(String[] args) {
        int num=3;
       int sum1= sum(num);
        System.out.println(sum1);
    }

    private static int sum(int num) {
        if (num==1)
            return 1;
        return num+sum(num-1);
    }
}
