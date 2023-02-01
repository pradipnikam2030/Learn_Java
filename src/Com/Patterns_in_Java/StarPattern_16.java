package Com.Patterns_in_Java;

public class StarPattern_16 {
    public static void main(String[] args) {
        for (int i=0; i<9; i++)
        {
            for (int j=0; j<9; j++)
            {
                if ((j-i>=0 && j+i<=8) || (j+i>=8 && j-i<=0))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
