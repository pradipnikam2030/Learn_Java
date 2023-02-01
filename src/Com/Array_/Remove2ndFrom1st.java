package Com.Array_;

public class Remove2ndFrom1st {
    public static void main(String[] args) {
        int[] a={1,1,1,1,1,2,2,3,4};
         int[] b= {1,2,4};
        for (int i=0; i<b.length; i++)
        {
            int count=0;
            for (int j=0; j<a.length; j++)
            {
               if (b[i]==a[j])
                   count++;
               if (count>=2)
                   break;
            }
            int []c=new int [a.length-count];
            int index=0;
            int cnt=0;
            for (int j=0; j<a.length; j++)
            {
                if (b[i]==a[j] && cnt<2)
                     cnt++;
                else
                    c[index++]=a[j];

            }
            a=c;

        }
    }
}
