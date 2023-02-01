package String_;

import java.util.Locale;

public class SortByDictionry1 {
    public static void main(String[] args) {
        String s = "welcome to hefshine";
        myCode(s);
    }

    private static void myCode(String s1) {
        String[] sa = s1.split(" ");
        for (int i = 0; i < sa.length; i++) {
            for (int j = i + 1; j < sa.length; j++) {
                //int ans = myCompareToIgnoreCase(sa[i], sa[j]);
                if (myCompareToIgnoreCase(sa[i], sa[j])> 0) {
                    String temp = sa[i];
                    sa[i] = sa[j];
                    sa[j] = temp;
                }
            }
        }
        for (String data:sa)
            System.out.println(data);
    }
        private static int myCompareToIgnoreCase (String s1, String s2){
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            for (int i = 0; i < s1.length() && i < s2.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    return s1.charAt(i) - s2.charAt(i);
            }
            return s1.length() - s2.length();
        }

}