package String_Recursion;

public class SumOfDigitsPresentInTheString {
    public static void main(String[] args)
    {
        String s1="a2ba1ca3d";
        System.out.println(sums(s1, 0, 0));
    }
    private static int sums(String s1, int i,int sum)
    {
        if(i<s1.length())
        {
            if(s1.charAt(i)>='0'&&s1.charAt(i)<='9')
                sum+=s1.charAt(i)-48;
            return sums(s1, ++i,sum);
        }
        return sum;
    }
}
