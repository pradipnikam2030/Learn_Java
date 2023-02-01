package Recursion;

class LeastSubArray {
    public static void main(String[] args)
    {
        int[] a= {3,7,90,20,5,50,40};
        int k=3;
        Data data=new Data();
        iLoop(data, a, 0,k);
        System.out.println(data.min+" "+data.index);
    }
    private static void iLoop(Data data, int[] a, int i, int k) {
        if (i <= a.length - k) {
            int sum = jLoop(a, i, 0,i,k);
            int avg = sum / k;
            if (avg < data.min) {
                data.min = avg;
                data.index = i;
            }
            iLoop(data, a, ++i, k);
        }
    }
    private static int jLoop(int[] a,int j, int sum, int i,int k)
    {
        if(j<i+k)
        {
            sum+=a[j];
            return jLoop(a,++j, sum ,i,k);
        }
        return sum;
    }
}
class Data
{
    int index=0;
    int min=Integer.MAX_VALUE;
}
