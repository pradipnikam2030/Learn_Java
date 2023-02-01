package String_;

public class ToUpperCase {
    public static void main(String[] args) {
        String s1="abCd";
        System.out.println(s1.toUpperCase());

        System.out.println( myUpperCase(s1));
    }

    private static String myUpperCase(String s1) {
        String s2="";
        for (int i=0; i<s1.length(); i++)
        {
            char ch=s1.charAt(i);
            if (ch>='a'&&ch<='z')
            {
                s2=s2+(char)(ch-32);
            }
            else
                s2=s2+ch;
        }
        return s2;
    }
}
