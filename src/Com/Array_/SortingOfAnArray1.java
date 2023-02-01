package Com.Array_;

import java.util.Arrays;

public class SortingOfAnArray1 {
    public static void main(String[] args) {
        int []arg={11,22,33,44,34,55,11,33,44,55,56};
        for (int i=0; i< arg.length; i++)
        {
            for (int j=0; j< arg.length-1;j++)
            {
                if (arg[j]>arg[j+1]) {
                    int temp = arg[j];
                    arg[j] = arg[j + 1];
                    arg[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arg));
    }
}
