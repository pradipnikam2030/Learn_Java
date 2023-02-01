package Com.Patterns_in_Java;

public class AlphabetPattern_5_29 {
    public static void main(String[] args) {
        for(int i=0; i<11; i++ )
        {
            int count=0;
            for (int j=0; j<6; j++)
            {
                if(j+i<=5||j-i<=-5)
                    System.out.print((char)(count++ +65));

            }
            System.out.println();
        }
    }
}
