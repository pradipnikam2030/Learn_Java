package Variation;

public class NthFiboNumDivBy10 {
    public static void main(String[] args) {
        int n=100;
        if(isMultiple(n))
            System.out.println("Yes");
        else
            System.out.println("NO");
    }

    private static boolean isMultiple(int n) {
        int f=fibbonaci(n);
        return (f%10==0);
    }

    private static int fibbonaci(int n) {
        int a=0;
        int b=1;
        int c=0;
       if(n<=1)
           return n;
        for (int i=2; i<=n; i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
}
