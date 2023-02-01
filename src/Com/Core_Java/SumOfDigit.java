package Com.Core_Java;

public class SumOfDigit {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        int count=0;
        while (num>0)
        {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
            count++;
        }
        System.out.println("sum of digits are : "+sum);
        System.out.println("Count of digits are : "+count);
    }
}
