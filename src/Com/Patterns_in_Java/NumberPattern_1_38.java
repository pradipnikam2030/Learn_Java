package Com.Patterns_in_Java;
//        1
//        12
//        123
//        1234
//        12345


public class NumberPattern_1_38 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                if (j-i<=0)
                System.out.print(j+1);
                else
                    System.out.print("");

            }
            System.out.println();
        }
    }
}
