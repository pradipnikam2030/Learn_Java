package Com.Patterns_in_Java;

//        A
//        B G
//        C H M
//        D I N S
//        E J O T Y
//        F K P U Z _

public class AlphabetPattern_13_37 {
    public static void main(String[] args) {
        int count=0;
        for (int i=0; i<6; i++)
        {
            int count1=count;
            for (int j=0; j<6; j++)
            {
                if(j-i<=0)
                    System.out.print((char)(count1 +65) +" ");
                count1=count1+5;
            }
            count++;
            System.out.println();
        }
    }
}
