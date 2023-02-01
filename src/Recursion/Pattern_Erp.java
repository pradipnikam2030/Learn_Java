package Recursion;

public class Pattern_Erp {
    public static void main(String[] args)
    {
        int irange=5;
        int jrange=5;
        myCode(irange,jrange);
    }
    //EndOfMainMethod
    private static void myCode(int irange,int jrange)
    {
        int i=0;
        iLoop(i, irange, jrange);
    }

    private static void iLoop(int i, int irange, int jrange) {
        if (i<irange)
        {
            int j=0;
            jLoop(i, j, jrange);
            System.out.println();
            i++;
            iLoop(i, irange, jrange);
        }
    }

    private static void jLoop(int i, int j, int jrange) {
        if(j<jrange)
        {
            System.out.print("*");
            j++;
            jLoop(i, j, jrange);
        }
    }
}
