package String_Recursion;

public class ToLoweCaseRec {
    public static void main(String[] args)
    {
        String s1 = "WELCOME";
        String s2="";
        System.out.println(iLoop(s1,s2, 0));
    }
    private static String iLoop(String s1, String s2,int i )
    {
        if(i<s1.length())
        {
            if(s1.charAt(i)>='A'&&s1.charAt(i)<='Z')
                s2+=(char)(s1.charAt(i)+32);
            else
                s2+=s1.charAt(i);
            return iLoop(s1, s2, ++i);
        }
        return s2;
    }

}
