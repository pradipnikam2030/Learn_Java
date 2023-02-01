package Com.Array_;

public class MaxMinElein2D {
    public static void main(String[] args) {
        int[][] a={
            {1,2,3},
            {3,5,6},
            {9,5,6}};

        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                if (a[i][j]>max)
                    max=a[i][j];
                if (a[i][j]<min)
                    min=a[i][j];
            }
        }
        System.out.println("Max Element : "+max);
        System.out.println("Min Element : "+min);
    }
}
