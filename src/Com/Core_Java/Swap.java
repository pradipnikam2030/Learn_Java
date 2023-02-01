package Com.Core_Java;

public class Swap {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        System.out.println("before swap" +x+" "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("after swap"+x+" "+y);

    }
}
