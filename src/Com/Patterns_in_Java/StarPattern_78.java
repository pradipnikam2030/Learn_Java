package Com.Patterns_in_Java;

public class StarPattern_78 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<20; j++)
            {
                if ((j-i<=0 && j<=4) || (j+i<=9 && j>=5) ||(j-i>=10 && j<=14) ||( j+i>=19 && j>=15))
                    System.out.print("*");                                   //j+i>=4
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//