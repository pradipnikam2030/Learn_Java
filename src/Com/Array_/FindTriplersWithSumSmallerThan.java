package Com.Array_;
//Write a program to find out count of triplets with sum smaller than given sum value.
//        Examples:
//        Array=[5,1,3,4,7] S=12.
//        (1,3,4),(1,3,5),(1,3,7),(1,4,5)

public class FindTriplersWithSumSmallerThan {
    public static void main(String[] args) {
        int[] a={5,1,3,4,7};
        int num=12;
        for (int i=0; i<a.length; i++)
        {
            for (int j=i+1; j<a.length; j++)
            {
                for (int k=j+1; k<a.length; k++)
                {
                    if (a[i]+a[j]+a[k]<num)
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                }
            }
        }
    }
}
