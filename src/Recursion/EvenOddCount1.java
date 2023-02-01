package Recursion;

public class EvenOddCount1 {
    public static void main(String[] args) {
        int[] a={1,2,4,4,2,1};

        int[] b=new int[2];
        iLoop(a, b, 0);
        System.out.println("Even Count : "+b[0]);
        System.out.println("Odd Count : "+b[1]);
    }

    private static void iLoop(int[] a, int[] b, int i) {
        if (i<a.length)
        {
               if (a[i]%2==0)
                   b[0]++;
               else
                   b[1]++;
            iLoop(a, b, ++i);
        }
    }
}
