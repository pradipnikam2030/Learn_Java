package String_;
//7) Write a program to repeat each of the character twice in a given string.
public class Question7 {
    public static void main(String[] args) {
        String s1="Pradip";
        for(int i=0; i<s1.length(); i++)
        System.out.print(s1.charAt(i)+""+s1.charAt(i));
    }
}
