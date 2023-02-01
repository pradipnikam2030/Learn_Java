package Com.Array_;

import java.sql.SQLOutput;

/*31. Given an integer array and size of subarray,find the first subarray with leasts
 average in single loop. Print firstindex of subarray and average. (Mindstix) (Variations)
  Example: Input: int arr={3,7,90,20,5,50,40}, k=3,Output: Index:3, Avg:25*/
public class SubArray {
    public static void main(String[] args) {
        int []a={3,7,90,20,5,50,40};
        int sizeOfSubArray=4;
        int min=Integer.MAX_VALUE;
        int index=0;
        for (int i=0; i<=a.length-sizeOfSubArray; i++)
        {
            int sum=0;
            for (int j=i; j<i+sizeOfSubArray; j++)
            {
                System.out.print(a[j]);
                sum=sum+a[j];
            }
            System.out.println(sum);
            if (sum<min)
            {
                min=sum;
                index=i;
            }
        }
        System.out.println(index+" "+min+" "+min/sizeOfSubArray);
    }
}
