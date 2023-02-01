package Com.Core_Java;

public class PrintOddandEven {
    public static void main(String[] args) {
        int start=1;
        int end=50;
        System.out.print("even : ");
        for(int i=start; i<=end; i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
        System.out.print("\nodd  : ");
        for (int j=start; j<=end; j++)
        {
            if(j%2!=0)
                System.out.print(j+" ");
        }
    }
}
