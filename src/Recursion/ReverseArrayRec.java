package Recursion;

import java.util.Arrays;

public class ReverseArrayRec {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int j=a.length-1;
        reverse(a, 0, j);
        System.out.println(Arrays.toString(a));
    }

    private static void reverse(int[] a, int i, int j) {
        if (i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            reverse(a, ++i, --j);
        }
    }
}
