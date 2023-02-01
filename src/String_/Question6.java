package String_;
//6) Write a program to get the index of all the characters within the String
public class Question6 {
    public static void main(String[] args) {
        String s1="Pradip";
        char[] ca=s1.toCharArray();

        for(int i=0; i<ca.length; i++)
            System.out.println(ca[i]+" "+i);

    }
}
