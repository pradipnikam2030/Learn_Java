package String_;

public class CountElement {
    public static void main(String[] args) {
        String s="aaabbbcccdde";
        for (int i=0; i<s.length(); i++)
            //System.out.println(isItOriginalChar(s, i));
        if(isItOriginalChar(s, i))
            System.out.println(s.charAt(i)+" "+giveFreq(s, s.charAt(i)));
    }
    private static boolean
     isItOriginalChar(String s, int i)
    {
        for (int j=0; j<i; j++)
            if (s.charAt(i)==s.charAt(j))
                return false;
        return true;
    }
    private static int giveFreq(String s, char ch)
    {
        int count=0;
        for (int i=0; i<s.length(); i++)
            if (s.charAt(i)==ch)
                count++;
                return count;
    }
}
