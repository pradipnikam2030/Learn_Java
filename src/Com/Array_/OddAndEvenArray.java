package Com.Array_;

import java.util.Arrays;

public class OddAndEvenArray {
    public static void main(String[] args) {
        int[]a={66,23,56,21,24,55,48,47,99,88,22};
        int evenArraySize=0;
        int  odArraySize=0;
        for (int i=0; i<a.length;i++)
        {
            if(a[i]%2==0)
                evenArraySize++;
            else
                odArraySize++;
        }
        int []evernArray=new int[evenArraySize];
        int []oddArray=new int [odArraySize];
        int evenIndex=0;
        int oddIndex=0;
        for (int i=0; i<a.length;i++)
        {
            if (a[i]%2==0)
                evernArray[evenIndex++]=a[i];
            else
                oddArray[oddIndex]=a[i];
        }
        System.out.println(Arrays.toString(evernArray));
        System.out.println(Arrays.toString(oddArray));
    }
}
