package String_Recursion;

public class TrimMethod {
    public static void main(String[] args) {
        String s1="   abc xyz      ";
     int  i= firstLoop(s1, 0);
      int  j=seLoop(s1, s1.length()-1);
       String s2="";
     s2= print(s1, i, j, i, s2);
        System.out.println(s2);


    }

    private static String print(String s1, int i, int j, int k, String s2) {
        if (k<=j)
        {
            s2+=s1.charAt(k);
            return print(s1, i, j, ++k,s2);
        }
        return s2;
    }

    private static int seLoop(String s1, int j) {
        if (j>=0)
        {
            if (s1.charAt(j)!=' ')
                return j;
           return seLoop(s1, --j);
        }
        return j;
    }

    private static int firstLoop(String s1, int i) {
        if (i<s1.length())
        {
             if(s1.charAt(i)!=' ')
                 return i;
           return firstLoop(s1, ++i);
        }
        return i;
    }
}
