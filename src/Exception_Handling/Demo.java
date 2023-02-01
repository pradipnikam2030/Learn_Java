package Exception_Handling;
/*Exception Handiling:
*    is a mechanism to handle the exception occuer in the code*/
public class Demo {
    public static void main(String[] args) {
        System.out.println("Hello");
        String s1="abcd";
        try {
            System.out.println("1");
            System.out.println(2);
            System.out.println(3);
            System.out.println(s1.charAt(100));
            System.out.println(4);
            System.out.println(5);
        }

        catch (Exception p)
        {
            System.out.println("Something is wrong");
        }
        System.out.println("Hello");
    }
}
