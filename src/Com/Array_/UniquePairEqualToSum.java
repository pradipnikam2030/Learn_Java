package Com.Array_;

public class UniquePairEqualToSum {
    public static void main(String[] args)
    {
        int[] a= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int ele=7;
        int uniqueArraySize=uniqueCount(a, 0);
        int[] b=new int[uniqueArraySize];
        int index=0;

        uniquePair(a, b, index);

        for(int i=0; i<b.length; i++)
        {
            for(int j=i+1; j<b.length; j++)
            {
                if(b[i]+b[j]==ele)
                    System.out.println(b[i]+" "+b[j]);
            }
        }
    }

    private static void uniquePair(int[] a, int[] b, int index)
    {
        for(int i=0; i<a.length; i++)
        {
            boolean isUnique=true;
            for(int j=0; j<i; j++)
            {
                if(a[i]==a[j])
                {
                    isUnique=false;
                    break;
                }
            }
            if(isUnique)
                b[index++]=a[i];
        }
    }

    private static int uniqueCount(int[] a, int count)
    {
        for(int i=0; i<a.length; i++)
        {
            boolean isUnique=true;
            for(int j=0; j<i; j++)
            {
                if(a[i]==a[j])
                {
                    isUnique=false;
                    break;
                }
            }
            if(isUnique)
                count++;
        }
        return count;
    }

}
