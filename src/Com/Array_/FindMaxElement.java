package Com.Array_;

public class FindMaxElement {
    public static void main(String[] args) {
        int []a={2132,232,65,665,59,89,232,232};
        int max=a[0];
        int min=a[0];
        for (int i=0; i<a.length; i++)
        {
            if(a[i]>max)
                max=a[i];
            if (a[i]<min)
                min=a[i];
        }
        System.out.println(max);
        System.out.println(min);

    }
}
