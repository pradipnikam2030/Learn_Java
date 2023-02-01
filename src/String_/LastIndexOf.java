package String_;

public class LastIndexOf {
    public static void main(String[] args) {
        String s1="xcdhdhdkjhdhkj";
        String s2="xc";
        System.out.println(s1.lastIndexOf(s2));
        System.out.println( myIndexof(s1, s2));
    }

    private static int myIndexof(String s1, String s2) {
        int lastIndex=-1;
        for (int i=0; i<=s1.length()-s2.length(); i++)
        {
            if (s2.charAt(0)==s1.charAt(i))
            {
                int s1Index=i;
                int s2Index=0;
                int count=0;
                while (s2Index<s2.length())
                {
                    if (s1.charAt(s1Index)==s2.charAt(s2Index))
                    {
                        s1Index++;
                        s2Index++;
                        count++;
                    }
                    else
                        break;;
                }
                if (s2.length()==count)
                    lastIndex=i;
            }
        }
        return lastIndex;
    }
}
