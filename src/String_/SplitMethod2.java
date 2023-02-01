package String_;

import java.util.Arrays;

public class SplitMethod2 {
    public static void main(String[] args) {
        String s1="You are going to be a developer soon";
        char ch=' ';
        int size=sizeOfArray(s1, ch);
        mySplitMethod(s1, ch, size);

    }
    private static void mySplitMethod(String s1, char ch, int size) {
        String[] sa=new String[size+1];
        String s2="";
        int index=0;
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)!=ch) {
                s2 = s2 + s1.charAt(i);
            }
            else {
                sa[index++] = s2;
                s2="";
            }
        }
        sa[index]=s2;
        System.out.println(Arrays.toString(sa));
    }

    private static int sizeOfArray(String s1, char ch) {
        int count=0;
        for (int i=0; i<s1.length(); i++)
            if (s1.charAt(i)==ch)
                count++;
        return count;
    }
}
