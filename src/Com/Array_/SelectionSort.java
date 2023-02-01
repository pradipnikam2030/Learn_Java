package Com.Array_;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int []a={99,88,77,56,56,465,62,4,54,65,6};

        for (int i=0; i<a.length; i++)
        {
            int min=i;
            for (int j=i+1; j<a.length; j++)
            {
                if (a[j]<a[min])
                    min=j;
            }
            int temp=a[i];
            a[i]=a[min];
            a[min]=temp;

        }

        System.out.println(Arrays.toString(a));
    }
}
