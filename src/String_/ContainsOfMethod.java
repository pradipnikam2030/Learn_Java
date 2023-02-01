package String_;

public class ContainsOfMethod
{
    public static void main(String[] args) {
        String s1="hefshinnsshinnekshinek";
        String s2="shine";

        boolean b=myContainsof(s1,s2);
        System.out.println(b);
    }

    private static boolean myContainsof(String s1, String s2) {
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)==s2.charAt(0))
            {
                int j=i;
                int k=0;
                int count=0;
                while(k<s2.length() && j<s1.length())
                {
                    if (s1.charAt(j)==s2.charAt(k))
                        count++;
                        k++;
                        j++;
                }
                if (count==s2.length())
                    return true;
            }
        }
        return  false;
    }
}
