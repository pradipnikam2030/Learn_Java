package String_;

public class ContainsOnlyDigitsOrNot {
    public static void main(String[] args) {
        String s="1234";

        boolean result=onlyDigits(s);
        if (result)
            System.out.println("only digits");
        else
            System.out.println("not only digits");
    }

    private static boolean onlyDigits(String s) {
        for (int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch<'0'||ch>'9')
                return false;
        }
        return true;
    }
}
