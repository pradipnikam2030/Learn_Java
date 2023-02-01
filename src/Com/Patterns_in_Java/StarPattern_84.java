package Com.Patterns_in_Java;

public class StarPattern_84 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<9; j++)
            {
                if (i==2 || j==4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}
