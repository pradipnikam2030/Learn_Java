package String_;

public class PrintDuplicateAndCountIt {
    public static void main(String[] args) {
        int count=0;
        String s="aaabbbbdddccce";
        for (int i=0; i<s.length(); i++)
            if(!isItOriginalChar(s, i))
            {
                count++;
                System.out.print(s.charAt(i));
            }
        System.out.println(" "+count);
    }
    private static boolean
    isItOriginalChar(String s, int i)
    {
        for (int j=0; j<i; j++)
            if (s.charAt(i)==s.charAt(j))
                return false;
        return true;
    }
}
