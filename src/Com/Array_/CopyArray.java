package Com.Array_;

public class CopyArray {
    public static void main(String[] args) {
        int [] a={11,22,33,44,55,66,77,88,99};
        int [] b=new int [a.length];
        for (int i=0; i<a.length; i++)
        {
            b[i]=a[i];
        }
        for (int i=0; i<b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}
