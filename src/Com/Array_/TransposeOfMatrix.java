package Com.Array_;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] a= {{1,52,3},
                {4,23,5},
                {5,4,52}
        };
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}
