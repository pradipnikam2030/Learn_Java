package String_;

public class CompareTwoString {
    //StartOfMainMethod
    public static void main(String[] args)
    {
        String s1 ="abcd";
        String s2 ="abcd";
        myCode(s1,s2);
    }
    //EndOfMainMethod
    private static void myCode(String s1,String s2)
    {
        if(s2.length()==s1.length())
        {
            boolean flag=false;
            for(int i=0; i<s1.length(); i++) {

                if (s1.charAt(i) != s2.charAt(i)) {
                    System.out.println(s1.charAt(i) - s2.charAt(i));
                    flag=true;
                    break;
                }
            }
            if(!flag)
                    System.out.println(0);

        }
          else
            System.out.println(s1.length() - s2.length());

    }
}
