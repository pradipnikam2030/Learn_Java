package String_;

public class removeDuplicateElementFromString {
    public static void main(String[] args) {
        String s = "aasbbbbddeee";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {

            if(iwalaCharaIsPresentOnLeft(s, i)==false)
            s2 = s2 + s.charAt(i);

        }
        System.out.println(s2);
    }
        private static boolean iwalaCharaIsPresentOnLeft(String s, int i)
        {
            for (int j=0; j<i; j++)
                if (s.charAt(i)==s.charAt(j))
                    return true;
            return false;

    }
}
