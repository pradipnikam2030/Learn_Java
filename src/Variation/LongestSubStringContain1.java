package Variation;

public class LongestSubStringContain1 {
    // Java program to find length
// of longest substring containing '1'



        // Function to find length of
        // of longest substring containing '1'
        static int maxlength(String s)
        {
            int n = s.length(), i, j;
            int ans = 0;
            for (i = 0; i <= n - 1; i++) {

                // Count the number of contiguous 1's
                if (s.charAt(i) == '1') {

                    int count = 1;
                    for (j = i + 1; j <= n - 1 && s.charAt(j) == '1'; j++)
                        count++;
                    ans=count;
                }
            }
            return ans;
        }

        public static void main(String[] args)
        {
            String s = "11101110";

            System.out.println(
                    "Length of longest substring containing '1' = "
                            + maxlength(s));
        }


}

