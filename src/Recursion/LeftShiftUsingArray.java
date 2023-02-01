package Recursion;

public class LeftShiftUsingArray {
    public static void main(String[] args)
    {
        int[] a= {3,2,4,6,5,6,8};
        int temp=a[0];
        iLoop(0, a, temp);
        printArray(0,a);
    }
    private static void printArray(int i, int[] a)
    {
        if(i<a.length)
        {
            System.out.print(a[i]+" ");
            printArray(++i, a);
        }
    }
    private static void iLoop(int i, int[] a, int temp)
    {
        if(i<a.length-1)
        {
            a[i]=a[i+1];
            iLoop(++i, a, temp);
        }
        a[a.length-1]=temp;
    }
}
