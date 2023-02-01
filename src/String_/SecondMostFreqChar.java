package String_;

public class SecondMostFreqChar {
    public static void main(String[] args)
    {
        String s1 = "abbcccdddd";
        myCode(s1);
    }
    //EndOfMainMethod
    private static void myCode(String s1)
    {
        int max=Character.MIN_VALUE;
        int max2=Character.MIN_VALUE;
        char ch=0;
        for(int i=0; i<s1.length(); i++)
        {
            int count=0;
            for(int j=0; j<i; j++)
            {
                if(s1.charAt(i)==s1.charAt(j))
                    count++;
            }
            if(count==0)
            {
                int freq=0;
                for(int j=0; j<s1.length(); j++)
                {
                    if(s1.charAt(i)==s1.charAt(j))
                        freq++;
                }
                if(freq>max)
                {
                    max=freq;
                }
                if(freq>max2&&freq!=max)
                {
                    max2=freq;
                    ch=s1.charAt(i);
                }
            }
        }
        System.out.print(ch+" "+max2);
    }
}
