package String_;

public class SumOfDigits {
    public static void main(String[] args) {
        String s="23kdjf4";
        int sum=sumOfDigits(s);
        System.out.println(sum);
    }

    private static int sumOfDigits(String s) {
        int sum=0;
        for (int i=0;i<s.length(); i++){
            char ch=s.charAt(i);
            if(ch>='0'&&ch<='9')
                sum=sum+ch-48;
        }
        return sum;
    }
}
