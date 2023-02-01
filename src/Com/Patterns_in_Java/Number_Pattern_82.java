package Com.Patterns_in_Java;

public class Number_Pattern_82 {
    public static void main(String[] args) {
        int irange = 5;
        int jrange = 10;
        myCode(irange, jrange);

    }


    private static void myCode(int irange, int jrange) {
        int count = 1;
        int cnt = 1;
        iLoop(0, irange, jrange, count, cnt);

    }

    private static void iLoop(int i, int irange, int jrange, int count, int cnt) {
        if (i < irange) {
            jLoop(i, 0, jrange, count, cnt);
            cnt++;
            count++;
            System.out.println();
            iLoop(i + 1, irange, jrange, count, cnt);
        }
    }

    private static void jLoop(int i, int j, int jrange, int count, int cnt) {
        if (j < jrange) {
            if (j - i <= 0 || j + i >= 9)
                System.out.print(count);
            else
                System.out.print(" ");

            jLoop(i, j + 1, jrange, count, cnt);
        }
    }
}
