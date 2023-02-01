package Com.Core_Java;

public class KaprekarNumber {
    public static void main(String[] args) {
       int num=81;
       int temp=num;
       int square=num*num;
        System.out.println(square);
       int count=0;
       while(num>0)
       {
           num=num/10;
           count++;
       }
        System.out.println(count);
       int div=(int) Math.pow(10, count);
        System.out.println(div);
       int x=square/div;
       int y=square%div;
        System.out.println(x+" "+y);
       int sum=x+y;

       if(sum==temp)
           System.out.println("Kaprekar Number");
       else
           System.out.println("NOt a Kaprekar Number");

    }
}
