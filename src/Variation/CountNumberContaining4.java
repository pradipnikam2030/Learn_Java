package Variation;

public class CountNumberContaining4 {
    static int countNumbersWith4(int n)
    {
        // initialize result
        int result = 0;

        // One by one compute sum of digits
        // in every number from 1 to n
        for (int x=1; x<=n; x++)
            if(has4(x))
                result++;

        return result;
    }

    // A utility function to compute sum
    // of digits in a given number x
    static boolean has4(int x)
    {
        while (x != 0)
        {
            if (x%10 == 4)
                return true;
            x   = x /10;
        }
        return false;
    }

    // Driver Program
    public static void main(String args[])
    {
        int n = 20;
        System.out.println("Count of numbers from 1 to "
                + " that have 4 as a digit is "
                + countNumbersWith4(n)) ;
    }
}
