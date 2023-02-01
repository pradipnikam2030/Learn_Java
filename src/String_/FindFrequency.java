package String_;

public class FindFrequency {
    public static void main(String[] args) {
        String s1="aaabbbcccddeek";
        String s2="";
        for(int i=0; i<s1.length();i++)
        {
            boolean flag=true;
            for (int j=0; j<i; j++)
            {
                   if(s1.charAt(i)==s1.charAt(j))
                      flag=false;
            }
            if (flag)
                s2=s2+s1.charAt(i);
        }
       // System.out.println(s2);
        for (int i=0; i<s2.length(); i++)
        {
            int cnt=0;
            for (int j=0; j<s1.length(); j++)

                if (s2.charAt(i)==s1.charAt(j)) {
                    cnt++;
                }
                    System.out.println(s2.charAt(i) + " " +cnt);
        }
    }
}
