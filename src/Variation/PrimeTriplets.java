package Variation;
class PrimeTriplets {
    public static void main(String[] args) {
        int n=15;
        for (int i=1; i<=n; i++) {
            if (isPrime(i) && isPrime(i + 2) && isPrime(i + 6))
                System.out.println(i + " " + (i + 2) + " " + (i + 6));
            else if(isPrime(i)&&isPrime(i+4)&&isPrime(i+6))
                System.out.println(i+" "+(i+4)+" "+(i+6));
        }
    }
 static boolean isPrime(int n)
 {
     int count=0;
     for (int i=1; i<=n; i++)
     {
         if(n%i==0)
             count++;
     }
     if (count==2)
         return true;
     else
         return false;
 }
}

