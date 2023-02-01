package Com.Patterns_in_Java;

//        A
//        AB
//        ABC
//        ABCD
//        ABCDE


public class AlphabetPattern_1_25 {
    public static void main(String[] args) {
        for (int i=0; i<5; i++)
        {
            int count=0;
            for (int j=0; j<5; j++)
            {
                if(j-i<=0)
                    System.out.print((char)(count++ +65));
            }
            System.out.println();
        }
    }
}
