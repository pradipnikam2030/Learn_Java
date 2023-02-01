package String_;
//8) Write a program to test if a given string contains only digits
public class Question8 {
    public static void main(String[] args) {
        String s1="6^^666";
      int count=0;
        for (int i=0; i<s1.length(); i++)
            if (s1.charAt(i)<'0' || s1.charAt(i)>'9' )
                  count++;
        if (count==0)
            System.out.println("contain only digit");
        else
            System.out.println("not only digit");
    }
}
