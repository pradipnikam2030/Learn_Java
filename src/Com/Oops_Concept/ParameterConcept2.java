package Com.Oops_Concept;

public class ParameterConcept2 {
    public static void main(String[] args) {
        int p=10000;
        int n=2;
        int r=10;
        siCalc(p, n, r);

    }
    //para without return
    public static void siCalc(int a, int b, int c)
    {
        int si=a*b*c/100;
        System.out.println(si);

    }
}
