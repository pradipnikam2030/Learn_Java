package String_;
// Compare Two String LexioGraphically...
public class CompareTo {
    public static void main(String[] args) {
        String s1="hefshine";
        String s2="hefshine";
        System.out.println(myCompareToMethod(s1, s2));
    }

    private static int myCompareToMethod(String s1, String s2) {
        for (int i=0; i<s1.length()&&i< s2.length(); i++)
        {
            if (s1.charAt(i)!=s2.charAt(i))
                return  s1.charAt(i)-s2.charAt(i);
        }
        return s1.length()-s2.length();
    }
}
