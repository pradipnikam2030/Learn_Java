package Com.Core_Java;

public class GrossSalary {
    public static void main(String[] args) {
        int basicSalary=15000;
        double Grosssalary;
        if(basicSalary<=10000)
        {
            Grosssalary=basicSalary+(basicSalary*20)/100+(basicSalary*80)/100;
            System.out.println(Grosssalary);
        }
        else if(basicSalary<=20000)
        {
            Grosssalary=basicSalary+(basicSalary*25)/100+(basicSalary*90)/100;
            System.out.println(Grosssalary);
        }
        else
        {
            Grosssalary=basicSalary+(basicSalary*30)/100+(basicSalary*95)/100;
            System.out.println(Grosssalary);
        }
    }
}

