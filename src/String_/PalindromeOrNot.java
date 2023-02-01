package String_;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String s="nayan";
        if (isPalindrome(s))
        System.out.println("Palindrome");
        else
            System.out.println("Not");
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j)
        {
            if (s.charAt(i)!=s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
}
