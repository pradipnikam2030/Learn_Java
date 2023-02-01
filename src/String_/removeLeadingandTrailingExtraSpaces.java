package String_;

public class removeLeadingandTrailingExtraSpaces {
    public static void main(String[] args) {
        String s="     Pradip      Nikam       ";
         s=s.trim();
       // System.out.println(s);
       s= remvoveBetweenSpaces(s);
        System.out.println(s);


    }

    private static String remvoveBetweenSpaces(String s) {

        String s2="";
        for (int i=0; i<s.length(); i++) 
        {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == ' ') 
            {}
            else
                s2 = s2 + s.charAt(i);
        }
        return s2;
    }
}
