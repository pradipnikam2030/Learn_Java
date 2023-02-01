package String_;

public class EndsWith {
    public static void main(String[] args) {
        String s = "abcd";
        String s1 = "cdscdcdccd";
        System.out.println( myEndsWith(s, s1));
    }

    private static boolean myEndsWith(String s, String s1) {


        if (s1.length() <= s.length())
        {
            int s1Index = s.length() - 1;
            int s2Index = s1.length() - 1;
            while (s2Index>=0)
            {
                if (s.charAt(s1Index)!=s1.charAt(s2Index))
                    return false;
                s1Index--;
                s2Index--;
            }
            return true;
        }
        else
            return false;
    }
}
