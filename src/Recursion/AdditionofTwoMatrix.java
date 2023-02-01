package Recursion;

public class AdditionofTwoMatrix {
    public static void main(String[] args) {
        int[][] a={{1,2,3},
                {4,5,6},
                {7,8,9}};
        int[][] b={{1,2,3},
                {4,5,6},
                {7,8,9}};
          iLoop(0, a, b);
    }

    private static void iLoop(int i, int[][] a, int[][] b) {
        if (i<a.length)
        {
             jLoop(0, i, a, b);
            System.out.println();
            iLoop(++i, a, b);
        }
    }

    private static void jLoop(int j, int i, int[][] a, int[][] b) {
        if (j<a.length)
        {
            System.out.print(a[i][j]+b[i][j]+" ");
            jLoop(++j, i, a , b);
        }
    }
}
