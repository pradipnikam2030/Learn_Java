package String_;

public class ReplaceWith {
    public static void main(String[] args) {
        String s1="Pradip";
        String s2=replaceOf(s1, 'i', 'e');
        System.out.println(s2);
    }

    private static String replaceOf(String s1, char k, char e) {
        String s2="";
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)==k)
                s2+=e;
            else
                s2+=s1.charAt(i);
        }
        return s2;
    }
}
