package Com.Patterns_in_Java;
//
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

public class NumberPattern_25_76 {
    public static void main(String[] args) {
        int count=1;
        for (int i = 0; i < 5; i++)
        {
            int cnt=count;
            int diff=4;
            for (int j=0; j<5; j++)
            {
                if (j-i<=0) {
                    System.out.print(cnt + " ");
                    cnt=cnt+diff;
                    diff--;
                }
            }

            count++;
            System.out.println();
    }
    }
}
