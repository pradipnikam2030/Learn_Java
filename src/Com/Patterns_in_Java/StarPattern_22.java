package Com.Patterns_in_Java;

public class StarPattern_22 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<9; j++){
                if(j-i>=0&&j-i<=4)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
