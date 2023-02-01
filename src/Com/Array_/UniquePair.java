package Com.Array_;

public class UniquePair {
    public static void main(String[] args)
    {
        int[] a=
                {
                        1,2,3,2,3
                }
                ;
        myCode(a);
    }
    //EndOfMainMethod
    private static void myCode(int[] a)
    {
        int newArraySize=0;
        for(int i=0; i<a.length; i++)
        {
            boolean isDup=false;
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    isDup=true;
                    break;
                }
            }
            if(!isDup)
                newArraySize++;
        }
        int[] b=new int[newArraySize];
        int index=0;
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
        for(int i=0; i<b.length; i++)
        {
            for(int j=i+1; j<b.length; j++)
            {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }

}
