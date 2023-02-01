package Com.Array_;

public class SadlePoint {
    public static void main(String[] args) {
        int[][] a={
                {6,3,9},
                {9,7,8},
                {2,4,5}
        };
        boolean found=false;
        for (int i=0; i<a.length; i++)
        {

            for (int j=0; j<a.length; j++)
            {
                boolean smallInRow = true;
                for (int k = 0; k < a.length; k++)
                {
                    if (a[i][j]>a[i][k])
                        smallInRow = false;
                }
                boolean largestInCol = true;
                for (int k = 0; k < a.length; k++)
                {
                    if (a[i][j]<a[k][j])
                        largestInCol = false;
                }
                if (largestInCol == true && smallInRow == true)
                {
                    System.out.println(a[i][j]);
                    found=true;
                }
            }
        }
        if (!found)
            System.out.println("not found");
    }
}
