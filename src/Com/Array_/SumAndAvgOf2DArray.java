package Com.Array_;

public class SumAndAvgOf2DArray {
    public static void main(String[] args) {
        int [][]b={{1,2,3},{4,5,6},{7,8,9}};
int sum=0;
int counter=0;

        for (int i=0; i<b.length; i++)
        {
            for (int j=0; j<b[i].length; j++) {
               sum=sum+b[i][j];
               counter++;
            }
        }
        System.out.println("sum : "+sum);
        System.out.println("avarage : " +sum/counter);
    }
}
