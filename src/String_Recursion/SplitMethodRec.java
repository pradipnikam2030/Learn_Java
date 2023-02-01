package String_Recursion;

import java.util.Arrays;
// split method using recursion...
public class SplitMethodRec {
    public static void main(String[] args) {
        String s1="welcome to hefshine developer in pune";
        int count=getCount(s1, 0, 0);
        String[] sa=new String[count+1];
        int index=0;
        String s2="";
       sa= spiltMethod(s1, sa, index, s2, 0);
       printArray(sa, 0);

    }

    private static void printArray(String[] sa, int i) {
        if(i<sa.length)
        {
            System.out.println(sa[i]);
            printArray(sa, ++i);
        }
    }

    private static String[] spiltMethod(String s1, String[] sa, int index, String s2, int i) {
        if (i<s1.length())
        {
            if (s1.charAt(i)!=' ')
                s2+=s1.charAt(i);
            else {
                sa[index++] = s2;
                s2="";
            }
           return spiltMethod(s1, sa, index, s2, ++i);
        }
        sa[index]=s2;
        return sa;
    }

    private static int getCount(String s1, int i, int count) {
        if (i<s1.length())
        {
            if (s1.charAt(i)==' ')
                count++;
           return getCount(s1, ++i,count);
        }
        return count;
    }
}
