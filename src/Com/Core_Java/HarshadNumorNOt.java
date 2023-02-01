package Com.Core_Java;

public class HarshadNumorNOt {
    public static void main(String[] args) {
        int num=81;
        int temp=num;
        int sum=0, rem;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(temp%sum==0) {
            System.out.println("Harshad number");
        }
        else {
            System.out.println("Not a Harshand Number");
        }
    }
}
