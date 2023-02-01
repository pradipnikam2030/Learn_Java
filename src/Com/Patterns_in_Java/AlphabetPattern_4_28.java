package Com.Patterns_in_Java;
//        A
//        AB
//        ABC
//        ABCD
//        ABCDE
//        ABCD
//        ABC
//        AB
//        A


public class AlphabetPattern_4_28 {
    public static void main(String[] args) {
        for (int i=0; i<9; i++)
        {
            int count=0;
            for (int j=0; j<5; j++)
            {
                if (j-i<=0 && j+i<=8)
                    System.out.print((char) (count++ +65));
            }
            System.out.println();
        }
    }
}
