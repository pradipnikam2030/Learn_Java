package String_Recursion;

import java.sql.SQLOutput;

public class IndexOf {
    static  int count=0;
    public static void main(String[] args) {
        String s1 = "abcdeffdcdsddcsm";
        String s2 = "cz";
        iLoop(s1, s2, 0);
    }

    private static void iLoop(String s1, String s2, int i) {
        if (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(0)) {
                int s1index = i;
                int s2index = 0;
                int count = jLoop(s1, s2, s1index, s2index, 0);
                if (count==0) {
                    System.out.println(i);
                    return;
                }
            }
            iLoop(s1, s2, ++i);
        }
    }

    private static int jLoop(String s1, String s2, int s1index, int s2index, int count) {
        if (s2index < s2.length()) {
            if (s1.charAt(s1index) != s2.charAt(s2index)) {
                count++;
                return count;
            }
            return jLoop(s1, s2, ++s1index, ++s2index, count);
        }
        return count;
    }
}