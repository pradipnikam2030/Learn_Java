package Recursion;

public class Pattern_3 {
    public static void main(String[] args) {
        int i=0;
        iLoop(i);
    }

    private static void iLoop(int i) {
        if (i<9)
        {
            int j=0;
            jLoop(i, j);
            System.out.println();
            i++;
            iLoop(i);
        }
    }

    private static void jLoop(int i, int j) {
        if (j<5)
        {
            if (j-i<=0&&j+i<=8)
                System.out.print("*");
            else
                System.out.print(" ");
            j++;
            jLoop(i, j);
        }
    }
}
