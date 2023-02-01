package String_;

public class StartsWith {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="";
        // inBuild Method
        System.out.println(s1.startsWith(s2));
        // userMethod
        System.out.println(myStartWith(s1, s2));
    }
    private static boolean myStartWith(String s1, String s2) {
            if (s2.length()>s1.length())
                return false;
            for (int i=0; i<s2.length(); i++)
                if (s2.charAt(i)!=s1.charAt(i))
                    return false;
                     return true;

    }
}
