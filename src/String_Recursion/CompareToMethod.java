package String_Recursion;

public class CompareToMethod {
    public static void main(String[] args) {
        String s1="abcd";
        String s2="abvh";
        System.out.println(myCompareTo(s1, s2, 0));
    }

    private static int myCompareTo(String s1, String s2, int i) {
        if(i<s1.length()&&i<s2.length())
        {
            if (s1.charAt(i)!=s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);
            return  myCompareTo(s1, s2, ++i);
        }
        return s1.length()-s2.length();
    }
}
