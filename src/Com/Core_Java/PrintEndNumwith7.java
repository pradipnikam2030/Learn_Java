package Com.Core_Java;

public class PrintEndNumwith7 {
    public static void main(String[] args) {
        int ele=8;
        for (int i=100; i<=200; i++)
        {
            if(i%10==ele)
                System.out.println(i);
        }
    }
}
