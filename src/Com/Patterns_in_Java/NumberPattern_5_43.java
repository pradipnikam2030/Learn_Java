package Com.Patterns_in_Java;

public class NumberPattern_5_43 {
    public static void main(String[] args) {
        int count=5;
        for (int i=0; i<5; i++)
        {
            int cnt=count;
            for (int j=0; j<5; j++)
            {
                if (j+i>=4)
                    System.out.print(cnt++ +" ");
                else

                System.out.print(" ");
            }
            count--;
            System.out.println();
        }
    }
}
