package Com.Array_;

public class EqualityOfTwoArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,6,9};
        int[] b={1,2,3,4,5,6,6,9};
        if (a.length!=b.length)
            System.out.println("not same");
        else
        {
            boolean isSame=true;
            for (int i=0; i<a.length; i++)
            {
                if (a[i] != b[i]) {
                    System.out.println("not same");
                    isSame = false;
                    break;
                }
            }
            if (isSame)
                System.out.println("same");
        }
    }
}
