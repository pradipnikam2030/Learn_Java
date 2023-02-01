package String_;

public class Question9 {
    public static void main(String[] args) {
        String s1="5465256";
        int sum=0;
        int count=0;
        for (int i=0; i<s1.length(); i++)
        {
            if (s1.charAt(i)>='0' && s1.charAt(i)<='9') {
                sum = sum + (s1.charAt(i)-48);
                count++;
            }
        }
        if (count==0)
            System.out.println("0");
        else
            System.out.println(sum);
    }
}
