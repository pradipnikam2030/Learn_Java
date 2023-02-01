package Com.Patterns_in_Java;
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE


public class AlphabetPattern_2_26 {
    public static void main(String[] args) {
        int count=0;
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                if(j-i<=0)
                    System.out.print((char) (count+65));
            }
            count++;
            System.out.println();
        }
    }
}
