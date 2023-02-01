package Com.Patterns_in_Java;

//        1
//        1 2 1
//        1 2 3 2 1
//        1 2 3 4 3 2 1
//        1 2 3 4 5 4 3 2 1

public class NumberPattern_23_71 {
    public static void main(String[] args) {
        for (int i=0; i<9; i=i+2)
        {
            int count=1;
            for (int j=0; j<9; j++)
            {
                if (j-i<=0)
                {
                    if (j<i/2)
                        System.out.print(count++ +" ");
                    else
                        System.out.print(count--  +" ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
