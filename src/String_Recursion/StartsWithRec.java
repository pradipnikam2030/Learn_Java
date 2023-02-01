package String_Recursion;

public class StartsWithRec {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abcde";
        if (s2.length()>s1.length())
            System.out.println(false);
        else
            System.out.println(myStartsWith(s1, s2, 0));
    }

    private static boolean myStartsWith(String s1, String s2, int i) {
        if (i<s2.length())
        {
            if (s1.charAt(i)!=s2.charAt(i))
                return false;
            return myStartsWith(s1, s2, ++i);
        }
        return true;
    }
}
