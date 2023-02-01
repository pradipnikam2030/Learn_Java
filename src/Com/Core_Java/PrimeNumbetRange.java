package Com.Core_Java;

public class PrimeNumbetRange {
    public static void main(String[] args) {
//        int start=1;
//        int end=100;
        for(int i=8; i<=50; i++)
        {
            int num=11;
            int temp=0;
            for(int j=1; j<=i; j++)
            {
                if(i%j==0)
                    temp++;
            }
            if(temp==2)
            {
                System.out.println(i);
            }
        }
    }
}
