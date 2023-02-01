package Recursion;

import java.sql.SQLOutput;

public class EqualityOfArrayRec {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        int[] b={1,2,3,4,5,6,7,8};
        if(a.length!=b.length)
            System.out.println("not same");
        else {
            boolean same=isSame(a, b, 0);
            if (same)
                System.out.println("same");
            else
                System.out.println("not same");
        }
    }

    private static boolean isSame(int[] a, int[] b, int i) {
        if (i< a.length)
        {
                if (a[i]!=b[i])
                return false;
          return isSame(a,b, ++i);
        }
      return true;
    }
}
