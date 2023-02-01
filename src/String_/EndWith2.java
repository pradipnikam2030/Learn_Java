package String_;

public class EndWith2 {
    public static void main(String[] args) {
        String s1="HefShine";
        String s2="";
        System.out.println(s1.endsWith(s2));
        System.out.println(myEndsWith(s1, s2));
    }

    private static boolean myEndsWith(String s1, String s2) {
        if (s2.length()>s1.length())
            return false;
         int i=s1.length()-1;
         int j=s2.length()-1;
         while (j>=0)
         {
             if (s1.charAt(i)!=s2.charAt(j))
                 return false;
             i--; j--;
         }
         return true;
    }
}
