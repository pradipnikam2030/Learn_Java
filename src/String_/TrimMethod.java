package String_;

import java.sql.SQLOutput;

public class TrimMethod {
    public static void main(String[] args) {

        String s1="      kamal ";
        System.out.println(s1.trim());
        int  count=0;
        for (int i=0; i<s1.length(); i++) {
            if(s1.charAt(i)==' ')
                count++;
        }
        if(count==s1.length())
            System.out.println();
  else {
            int i = 0;
            int j = s1.length() - 1;
            while (s1.charAt(i) == ' ')
                i++;
            System.out.println("start : " + i);
            while (s1.charAt(j) == ' ')
                j--;
            System.out.println("end " + j);
            String s2 = "";
            for (int k = i; k <= j; k++)
                s2 += s1.charAt(k);
            System.out.println(s2);
        }

    }
}
