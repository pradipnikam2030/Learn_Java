package Com.Array_;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] a={1,2,3,2,3};

        for (int i=0; i<a.length; i++)
        {
            boolean removeELe=true;
           for (int j=0; j<i; j++)
           {
               if (a[i]==a[j])
               {
                   removeELe=false;
                   //break;
               }
           }
           if (removeELe)
               System.out.print(a[i]+" ");
        }
    }
}
