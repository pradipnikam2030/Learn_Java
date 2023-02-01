package Com.Core_Java;

public class FibonaccaiSeries {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int count = 10;
        System.out.print(a + " " + b);
        for (int i = 2; i < count; i++) {
            int c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

    }
}
