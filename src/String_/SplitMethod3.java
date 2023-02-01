package String_;
public class SplitMethod3 {
    public static void main(String[] args) {
        String s1="You are going to be a developer soon";
        char ch=' ';
        String[] sa=mySplitMethod(s1, ch);
      for (String data:sa)
          System.out.print(data+" ");
    }
    private static String[] mySplitMethod(String s1, char ch) {
        int count=0;
        for (int i=0; i<s1.length(); i++)
            if (s1.charAt(i)==ch)
                count++;
//---------------------------------------------------------//
        String[] sa=new String[count+1];
        String s2="";
        int index=0;
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)!=ch) {
                s2 +=s1.charAt(i);
            }
            else {
                sa[index++] = s2;
                s2="";
            }
        }
        sa[index]=s2;
       return sa;
    }
}
