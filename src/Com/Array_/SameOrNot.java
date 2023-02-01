package Com.Array_;

public class SameOrNot {
    public static void main(String[] args) {
     int [] a={11,22,33,44,55,66,77,88,99};
     int [] b={11,22,33,4,455,66,777,88,99};
    // sameOrNot(a, b);
        System.out.println(same(a, b));

    }
    private static String same(int[] a, int[] b)
    {
        if (a.length!=b.length)
                return "not same";
        for (int i=0; i<a.length; i++)
           if(a[i] != b[i])
               return "not same";
        return "same";
    }
}
