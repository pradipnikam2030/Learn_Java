package Com.Array_;

import java.util.Arrays;

public class SadlePointRec {
    static int count=0;
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        iLoop(0, a);
        if(count==0)
        System.out.println("not found");
    }

    private static void iLoop(int i, int[][] a) {
        if (i < a.length) {
            jLoop(0, i, a);
            iLoop(++i, a);
        }
    }

    private static void jLoop(int j, int i, int[][] a) {
        if (j < a.length) {
            if (isSmallest(i, j, a, 0) && isLargest(i, j, a, 0)) {
                System.out.println(a[i][j]);
                count++;
            }
            jLoop(++j, i, a);
        }
    }

    private static boolean isLargest(int i, int j, int[][] a, int k) {
        if (k<a.length)
        {
            if (a[i][j]<a[k][j])
                return false;
            return isLargest(i, j, a, ++k);
        }
        return true;
    }

    private static boolean isSmallest(int i, int j, int[][] a, int k) {
        if (k < a.length) {
            if (a[i][j] > a[i][k])
                return false;
            return isSmallest(i, j, a, ++k);
        }
        return true;
    }
}