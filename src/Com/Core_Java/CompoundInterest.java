package Com.Core_Java;

public class CompoundInterest {
    public static void main(String[] args) {
        int p=2000;
        double r=0.05;
        int n=12;
        int t=5;
        double fpart=1+(r/n);
        double spart=n*t;
        double Cinterest=Math.pow(fpart, spart)*p;
        System.out.println(Cinterest);

    }
}
