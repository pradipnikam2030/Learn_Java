package Com.Patterns_in_Java;

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

public class StarPattern3 {
    public static void main(String[] args) {
        for (int i=0; i<=4; i++)
        {
            for (int j=0; j<=4; j++)
            {
                if (j-i<=0)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
