package Com.Oops_Concept;

public class ParameterConcept3 {
    public static void main(String[] args) {
        int p = 10000;
        int n = 2;
        int r = 10;
        int num = siCalc(p, n, r);
        System.out.println(num);

    }
//para with return
    public static int siCalc(int a, int b, int c) {
        int si = a * b * c/100;
        return si;
    }

}
