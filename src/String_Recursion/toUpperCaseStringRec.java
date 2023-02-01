package String_Recursion;
//toUpperCase String using Recursion
public class toUpperCaseStringRec {
    public static void main(String[] args)
    {
        String s1 = "welcome";
        String s2="";
        System.out.println(iLoop(s1,s2, 0));
    }
    private static String iLoop(String s1, String s2,int i )
    {
        if(i<s1.length())
        {
            if(s1.charAt(i)>='a'&&s1.charAt(i)<='z')
                s2+=(char)(s1.charAt(i)-32);
            else
                s2+=s1.charAt(i);
            return iLoop(s1, s2, ++i);
        }
        return s2;
    }

}
