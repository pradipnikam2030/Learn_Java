package String_;

public class EqualsTo {
    public static void main(String[] args) {
        String s1="asdc";
        String s2="asdh";
        //Java method
        System.out.println(s1.equals(s2));
        //Our method
        System.out.println(myEquals(s1, s2));
    }

    private static boolean myEquals(String s1, String s2) {
        if (s1.length()==s2.length())
        {
            for (int i=0; i<s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i))
                    return false;
            }
            return true;
        }
        else
            return false;
    }
}
