package Com.Core_Java;

public class FctorialOfNumber {
    public static void main(String[] args) {
        int num=4;
        int fact=1;
        for(int i=2; i<=num; i++)
        {
            fact=fact*i;

        }
        System.out.println(fact);
    }
}
