package Recursion;

public class PrimeOrNot {
    public static void main(String[] args) {
        int num=10;
        int cnt=0;
         cnt=isPrime(2, num,cnt);
        if (cnt==0)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }

    private static int isPrime(int i, int num, int cnt) {
       if (i<num)
       {
           if (num%i==0)
           {
               cnt++;
           }
           return isPrime(i+1, num, cnt);
       }
       return cnt;

    }
}
