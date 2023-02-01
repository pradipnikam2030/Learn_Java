package Recursion;

public class SumOfArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int sum=0;
       sum= iLoop(0, a, sum);
        System.out.println(sum);

    }

    private static int iLoop(int i, int[] a, int sum) {

        if(i<a.length) {

            sum += a[i];
             return iLoop(i + 1, a, sum);
        }
        return sum;
    }
}
