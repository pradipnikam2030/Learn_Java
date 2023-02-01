package Recursion;

public class Number_Pattern_1 {
    public static void main(String[] args) {
        int irange=9;
        int jrange=9;
        myCode(irange, jrange);
    }

    private static void myCode(int irange, int jrange) {
        loopI(irange, jrange, 0);
    }

    private static void loopI(int irange, int jrange, int i) {
        if (i<irange)
        {
            loopJ(i, 0, jrange);
            System.out.println();
            i++;
            loopI(irange, jrange, i);
        }
    }

    private static void loopJ(int i, int i1, int jrange) {
        if (i1<jrange)
        {
            if(i1-i<=0)
                System.out.print(i1+1);
            else
                System.out.print(" ");
            i1++;
            loopJ(i, i1, jrange);
        }
    }
}
