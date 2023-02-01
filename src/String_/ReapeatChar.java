package String_;

public class ReapeatChar {
    public static void main(String[] args) {
        String s="abcd";
        String s1="";
        for (int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            s1=s1+ch+ch;
        }
        System.out.println(s1);
    }
}
