package Com.Array_;

public class AvrageOfInnerElement {
    public static void main(String[] args) {
        int[][] a={
                {1,2,3,4},
                {5,6,7,8},
                {9,4,2,5},
                {7,2,4,9}
        };
        int sum=0;
        int count=0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                if (i!=0&&i!=a.length-1&&j!=0&&j!=a.length-1) {
                    sum += a[i][j];
                    count++;
                }

            }
        }
        System.out.println(sum/count);
        System.out.println(sum);
    }
}
