package Com.Oops_Concept;

public class ParameterConcept4 {
    public static void main(String[] args) {
        int num=siCalc();
        System.out.println(num);

    }
    //no para with return...
    public static int siCalc()
    {
        int p=10000;
        int n=2;
        int r=10;
        int si=p*n*r/100;
        return si;
    }
}
