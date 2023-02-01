package Com.Patterns_in_Java;

public class AlphabetPattern_6_30 {
    public static void main(String[] args) {
        int count=5;
        for (int i=0; i<12; i++)
        {
            int cnt = count;
            for (int j = 0; j < 6; j++)
            {
                if (j + i <= 5 || j - i <= -5)
                    System.out.print((char) (cnt-- + 65));
            }
            if (i<=4)
                count--;
            else if(i==6)
                count=0;
            else
                count++;
            System.out.println();
        }
    }
}
