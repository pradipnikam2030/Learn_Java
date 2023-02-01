package Com.Array_;

import java.sql.SQLOutput;

public class PairOfUniqueArray {
    public static void main(String[] args) {
        int[] a={1,1,1,2,3};
        int uniqueCount=Count(a, 0);
        System.out.println(uniqueCount);
        int[] b= new int[uniqueCount];
        int index=0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                if (a[i]!=b[i])
                    b[index++]=a[i];
            }
        }
    }


    private static int Count(int[] a, int count) {
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<i; j++)
            {
                if (a[i]==a[j])
                    count++;
            }
        }
        return count;
    }
}
