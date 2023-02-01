package String_;

public class ToSubString {
    public static void main(String[] args) {
        String s1="HefShine";
        String s3=s1.substring(0, 4);
        System.out.println(s3);

        System.out.println(  mySubString(0, 4, s1));
    }

    private static String mySubString(int start, int end, String s1) {
        String s2="";
        for (int i=start; i<end; i++)
        s2=s2+s1.charAt(i);;
        return s2;
    }
}
