package Com.Core_Java;

public class ReverseAndPalindrome {
    public static void main(String[] args) {
        int num=410;
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        System.out.println("Reverse number is : "+sum);
        if(temp==sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
