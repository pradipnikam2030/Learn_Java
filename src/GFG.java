import java.util.*;
public class GFG {
    public static void main(String[] args) {
        String str="heLLGFg";
        String s1="";
        String s2="";
        for(int i=0; i<str.length(); i++)
        {
            // check the char is uppercase
            if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
                s1+=str.charAt(i);
            else
                s2+=str.charAt(i);

        }
        System.out.println(s2+s1);
        // Code Contributed by Pradip Nikam...
    }
}
