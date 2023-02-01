package Recursion;

public class SumAndAvarageIn2D {
    static int count=0;
    //StartOfMainMethod
    public static void main(String[] args)
    {
        int[][] a=
                {{1,12,3,4},
                        {5,6,6,8},
                        {9,1,2,5},
                        {7,2,4,45}};
        myCode(a);
    }
    //EndOfMainMethod
    private static void myCode(int[][] a)
    {
        double sum=iLoop(0, a,0);
        double avg=0;
        System.out.println(sum);
        avg=sum/count;
        System.out.println(avg);
    }
    private static int iLoop(int i, int[][] a, int sum)
    {
        if(i<a.length)
        {
            sum=jLoop(0, i, a, sum);
            return iLoop(++i, a,sum);
        }
        return sum;
    }
    private static int jLoop(int j, int i, int[][] a,int add)
    {
        if(j<a[i].length)
        {
            if(i!=0&&i!=a.length-1&&j!=0&&j!=a.length-1)
            {
                add+=a[i][j];
                count++;
            }
            return jLoop(++j, i, a , add);
        }
        return add;
    }

}
