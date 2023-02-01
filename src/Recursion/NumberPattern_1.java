package Recursion;

public class NumberPattern_1 {
    public static void main(String[] args) {
        int irange=9;
        int jrange=9;
        myCode(irange, jrange);
    }

    private static void myCode(int irange, int jrange) {
        LoopI(0, irange, jrange);
    }

    private static void LoopI(int i, int irange, int jrange) {
        if (i<irange)
        {
            int count=1;
            loopJ(i,0, jrange, count);
            System.out.println();
            i++;
            LoopI(i, irange, jrange);
        }
    }

    private static void loopJ(int i, int j, int jrange, int count) {
        if (j<jrange)
        {
            if (j-i<=0)
                System.out.print(count++);
            else
                System.out.print(" ");
            j++;
            loopJ(i, j, jrange, count);
        }
    }
}
