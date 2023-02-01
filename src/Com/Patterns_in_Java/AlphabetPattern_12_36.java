package Com.Patterns_in_Java;
//        A
//        BA
//        CBA
//        DCBA
//        EDCBA
//        FEDCBA


public class AlphabetPattern_12_36 {
    public static void main(String[] args) {
        int count=0;
        for (int i=0; i<6; i++)
        {
            int count1=count;
            for (int j=0; j<6; j++)
            {
                if(j-i<=0)
                    System.out.print((char)(count1-- +65));
            }
            count++;
            System.out.println();
        }
    }
}
