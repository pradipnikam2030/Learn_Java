package String_Recursion;

public class RemoveDuplicateFromString {
    public static void main(String[] args)
    {
        String s1 = "abbcfedafbcd";
        String s2="";
        System.out.println(iLoop(s1,s2, 0));
    }
    private static String iLoop(String s1, String s2, int i)
    {
        if(i<s1.length())
        {
            boolean count=jLoop(s1, i, 0);
            if(!count)
                s2+=s1.charAt(i);
            return iLoop(s1, s2, ++i);
        }
        return s2;
    }
    private static boolean jLoop(String s1, int i, int j)
    {
        if(j<i)
        {
            if(s1.charAt(i)==s1.charAt(j))
              return true;
            return jLoop(s1,i, ++j);
        }
        return false;
    }
}
