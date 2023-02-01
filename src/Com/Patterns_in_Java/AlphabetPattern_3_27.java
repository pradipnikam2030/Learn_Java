package Com.Patterns_in_Java;
//        A
//        BB
//        CCC
//        DDDD
//        EEEEE
//        DDDD
//        CCC
//        BB
//        A


public class AlphabetPattern_3_27 {
    public static void main(String[] args) {
        int count=0;
        for (int i=0; i<9; i++)
        {
            for (int j=0; j<5; j++)
            {
                if(j-i<=0 && j+i<=8)
                    System.out.print((char)(count +65));
            }
            if (i<4)
            count++;
            else
                count--;
            System.out.println();
        }
    }
}
