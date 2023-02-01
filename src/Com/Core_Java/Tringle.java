package Com.Core_Java;

public class Tringle {
    public static void main(String[] args) {
        int s1=5;
        int s2=6;
        int s3=9;

        if(s1==s2 && s2==s3 && s1==s3)
            System.out.println("Equirateral Tringle");
        else if(s1==s2 || s2==s3 || s1==s3)
            System.out.println("iso");
        else
            System.out.println("sca");
    }
}
