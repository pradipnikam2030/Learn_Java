package Com.Core_Java;

public class NumberPattern_51 {
    public static void main(String[] args) {
        int count=1;
        for (int i=0; i<9; i++)
        {
            for (int j=0; j<5; j++)
            {
                int cnt=count;
                if (j+i>=4&&j-i>=-4)
                    System.out.print(cnt++ +" ");
                else
                    System.out.print(" ");
            }
             if (i<4)
                 count++;
             else
                 count--;
            System.out.println();
        }
    }
}
