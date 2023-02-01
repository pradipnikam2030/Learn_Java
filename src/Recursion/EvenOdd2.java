package Recursion;

public class EvenOdd2 {
    public static void main(String[] args) {
        int[] a={1,2,4,4,2,1};
        Data2 data=new Data2();
        iLoop(a, data, 0);
        System.out.println("Even Count :"+data.evenCount+"\n"+"Odd Count :"+data.OddCount);
    }
    private static void iLoop(int[] a, Data2 data, int i)
    {
        if (i<a.length)
        {
             if (a[i]%2==0)
                 data.evenCount++;
             else
                 data.OddCount++;
            iLoop(a, data, ++i);
        }
    }
}
class Data2{
    int evenCount=0;
    int OddCount=0;
}