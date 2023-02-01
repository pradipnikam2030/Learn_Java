package Recursion;

public class EvenOddCount3 {
    static int even=0;
    static  int odd=0;
    public static void main(String[] args) {
        int[] a={1,2,4,4,2,1};
        iLoop(a, 0);
        System.out.println("Even Count :"+even+"\n"+"Odd Count :"+odd);
    }

    private static void iLoop(int[] a, int i) {
        if (i<a.length)
        {
            if (a[i]%2==0)
                even++;
            else
                odd++;
            iLoop(a,++i);
        }
    }
}
