package Com.Array_;

import java.util.Arrays;

public class SortingOfAnArray {
    public static void main(String[] args) {
        int[]a={1,4,3,7,5,4,6,4,6};
        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                if (a[i]>a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
