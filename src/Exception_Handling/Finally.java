package Exception_Handling;

public class Finally {
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
        finally {
            System.out.println("Aakhiri Rasta");
            System.out.println(5/0














            );
        }
        System.out.println("Hello");
    }
}
