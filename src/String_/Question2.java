package String_;
//2) Write a program to create a new String object with the contents of a character array
public class Question2 {
    public static void main(String[] args) {
        String s1="54as86";
         int cnt=0;
        for(int i=0;i<s1.length();i++) {

            if (s1.charAt(i) < '0' || s1.charAt(i) > '9')
                cnt++;
        }
        if(cnt==0)
            System.out.println("only digit");
        else
            System.out.println("not only digit");
        }
    }

