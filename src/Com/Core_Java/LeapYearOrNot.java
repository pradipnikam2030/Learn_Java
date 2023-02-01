package Com.Core_Java;

public class LeapYearOrNot {
    public static void main(String[] args) {
        int year=2100;
        if(year%100==0)
        {
            if(year%400==0)
                System.out.println("leap");
            else
                System.out.println("Not leap");
        }
        else
        {
            if(year%4==0)
                System.out.println("leap");
            else
            System.out.println("not leap");
        }
    }
}
