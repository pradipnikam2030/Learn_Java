package Com.Patterns_in_Java;

public class Number_Pattern_82_ {
    public static void main(String args[]) {
        int irange = 5;
        int jrange = 10;
        myCode(irange, jrange);
    }

    private static void myCode(int irange, int jrange) {
        int count = 1;
        int cnt = 1;
        for (int i = 0; i < irange; i++) {
            for (int j = 0; j < jrange; j++) {
                if (j - i <= 0 || j + i >= 9)
                    System.out.print(count);
                else
                    System.out.print(" ");

            }
            cnt++;
            count++;
            System.out.println();
        }
    }
}
