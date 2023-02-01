package Recursion;

public class Print1To10 {
    public static void main(String[] args) {
        int i=1;
        loop(i);
    }
    private static void loop(int i) {
        if(i<=10)
        {
            System.out.println(i);
            i++;
            loop(i);
        }
    }
}
