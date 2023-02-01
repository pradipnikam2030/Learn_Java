package Recursion;

public class BasicSort {
    public static void main(String[] args) {
        int[] a={9,8,7,6,5,4,3,2,1};
        iLoop(0, a);
    }

    private static void iLoop(int i, int[] a) {
        if (i<a.length)
        {
            jLoop(i+1, a, i);
            System.out.print(a[i]);
            iLoop(i+1, a);
        }
    }

    private static void jLoop(int j, int[] a, int i) {
        if (j<a.length)
        {
            if (a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            jLoop(j+1, a, i);
        }
    }
}
