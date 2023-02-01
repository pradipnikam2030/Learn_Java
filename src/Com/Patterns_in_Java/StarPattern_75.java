package Com.Patterns_in_Java;
//
//        * *
//        ** **
//        *** ***
//        **** ****
//        ***** *****

public class StarPattern_75 {
    public static void main(String[] args) {
        ;
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                if (j-i<=0)
                    System.out.print("*");
            }
            System.out.print(" ");
            for (int j=0; j<5; j++)
            {
                if (j-i<=0)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
