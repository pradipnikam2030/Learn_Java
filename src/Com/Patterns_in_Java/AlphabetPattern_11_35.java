package Com.Patterns_in_Java;
//
//        A
//        B C
//        D E F
//        G H I J
//        K L M N O
//        P Q R S T U


public class AlphabetPattern_11_35 {
    public static void main(String[] args) {
        int count=0;
        for (int i=0; i<6; i++)
        {
            for (int j=0; j<6; j++)
            {
                if (j-i<=0)
                    System.out.print((char) (count++ +65)+" ");
            }
            System.out.println();
        }
    }
}
