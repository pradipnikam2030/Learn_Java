package Recursion;

public class Pattern_1 {
    public static void main(String[] args) {
        int i=0;
        loopI(i);
        System.out.println();
    }

    private static void loopI(int i) {
        if (i<5)
        {
            int j=0;
            loopJ(i,j);
            System.out.println();
          //  i++;
            loopI(i+1);
        }
    }

    private static void loopJ(int i, int j) {
        if (j<5)
        {
            if (j-i<=0)
                System.out.print("*");
            else
                System.out.print(" ");
          //  j++;
            loopJ(i, j+1);
        }
    }
}
