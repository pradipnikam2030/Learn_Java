package Com.Core_Java;

public class AdditionofDigit {
    public static void main(String[] args) {
        int num=123;
        int sum=0,rem;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
    }
}
