package Com.Core_Java;

public class ElectricityBill {
    public static void main(String[] args) {
        int units=30;
        bill(units);

    }
    private  static void bill(int units)
    {
        double bill;

        if(units<=50)
          bill=units*0.5;
            else if(units>=150)
                bill=units*0.5+(units-50)*0.75;
                else if(units>=250)
                    bill=units*0.5+100*0.75+(units-150)*1.2;
                    else
                        bill=units*0.5+100*0.75+100*1.2+(units-250)*1.5;

                    Double TotalBill=bill+(20*bill)/100;
        System.out.println("Total Bill : "+TotalBill);

    }
}
