package Com.Core_Java;

public class PrimeOrNotPrime {
    public static void main(String[] args) {
        int num=4;
        int isPrime=0;
         for(int i=1; i<=num-1; i++) {
             if (num % i == 0)

                   isPrime++;
         }

       if(isPrime==2)
             System.out.println("Prime");
         else
             System.out.println("Not Prime");
    }
}
