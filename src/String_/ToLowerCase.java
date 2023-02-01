package String_;

public abstract class ToLowerCase {
    public static void main(String[] args) {
        String s1="HEFsHINE";

        System.out.println(myToLowerCase(s1));

    }

    private static String myToLowerCase(String s1) {
        String s2="";
        for (int i=0; i<s1.length(); i++)
        {
                  char ch=s1.charAt(i);
            if (s1.charAt(i)>='A'&& s1.charAt(i)<='Z')
                s2 = s2 + (char) (ch + 32);
            else
                s2=s2+ch;
        }
        return s2;
    }

}
