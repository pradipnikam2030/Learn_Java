package String_Recursion;

public class EndsWith {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cd";
        if (s1.length() < s2.length())
            System.out.println(false);
        else {
            boolean result = endWtih(s1, s2, s1.length() - 1, s2.length() - 1);
            System.out.println(result);
        }
    }
        private static boolean endWtih(String s1, String s2, int i, int j)
        {
            if(j>=0)
            {
                if(s1.charAt(i)!=s2.charAt(j))
                    return false;
                return endWtih(s1, s2, --i, --j);
            }
            return true;
        }

}
