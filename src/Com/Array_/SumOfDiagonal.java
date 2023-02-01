package Com.Array_;
//27. Write a program to find sum of diagonal elements of a matrix. (Variations)
public class SumOfDiagonal {
    public static void main(String[] args) {
        int [][] a={
                {1,2,3,4},
                {5,6,7,8},
                {9,0,1,2},
                {3,4,5,6}
        };
        int sum=0;
        int psum=0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
                if (j-i==0)
                    sum=sum+a[i][j];
                if (j+i==3)
                    psum=psum+a[i][j];
            }
        }
        System.out.println("Diagoanal : "+sum);
        System.out.println("Principle Diagonal : "+psum);
    }
}
