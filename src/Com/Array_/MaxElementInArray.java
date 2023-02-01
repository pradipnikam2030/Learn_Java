package Com.Array_;

public class MaxElementInArray {
    public static void main(String[] args) {
        int[] a={2,3,2,5,3,53,32,34,23,5};
         int max=Integer.MIN_VALUE;
         for (int i=0; i<a.length; i++)
         {
             if (a[i]>max)
                 max=a[i];
         }
        System.out.println(max);
    }
}
