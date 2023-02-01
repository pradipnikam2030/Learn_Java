package Com.Patterns_in_Java;



//*****    i denotes row and j denotes column
//*****     first you have to print rows and then column.
//*****
//*****
//*****

//

public class StarPattern1 {
    public static void main(String[] args) {
        for(int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
