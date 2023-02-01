package Com.Patterns_in_Java;
//
//        A
//        A B A
//        A B C B A
//        A B C D C B A
//        A B C D E D C B A


public class AlphabetPattern_14_73 {
    public static void main(String[] args) {
        for (int i=0; i<9; i=i+2)
        {
            int count=0;
            for (int j=0; j<9; j++)
            {
                if (j-i<=0)
                {
                    if (j<i/2)
                        System.out.print((char) (count++ +65)+" ");
                    else
                        System.out.print((char) (count-- +65) +" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
