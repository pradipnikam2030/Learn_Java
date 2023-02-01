package String_;

public class MaxFreqChar {
    public static void main(String[] args) {
        String s1="abbcccdddd";
        char ch=' ';

        int max=0;

        for (int i=0; i<s1.length(); i++)
        {
            int count=0;
            for (int j=0; j<s1.length(); j++)
            {
               if(s1.charAt(i)==s1.charAt(j))
                   count++;
            }
            if (count>max)
            {
                max=count;
                ch=s1.charAt(i);
            }
        }
        System.out.println(max+" "+ch);

    }
}
