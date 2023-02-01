package Recursion;

public class TransposeOfMatrixRec {
    public static void main(String[] args) {
        int[][] a= {{1,52,3},
                {4,23,5},
                {5,4,52}
        };
     iLoop(0, a);
    }

    private static void iLoop(int i, int[][] a) {
        if(i<a.length)
        {
            jLoop(0, i, a);
            System.out.println();
            iLoop(++i, a);
        }
    }

    private static void jLoop(int j, int i, int[][] a) {
        if (j<a[i].length)
        {
            System.out.print(a[j][i]+" ");
            jLoop(++j, i, a);
        }
    }
}
