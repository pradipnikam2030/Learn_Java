package Recursion;

public class UniquePairEqualSum {
    public static void main(String[] args)
    {
        int[] a=
                {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
        int ele=7;
        int uniqueCount=getCount(a, 0,0);
        int[] b=new int[uniqueCount];
        makeUniArr(a,b,0,0);
        printArr(b,ele,0);
    }
    private static void printArr(int[] b, int ele, int i)
    {
        if(i<b.length)
        {
            jLoop(b, ele, i, i+1);
            //System.out.println();
            printArr(b,ele, ++i);
        }
    }
    private static void jLoop(int[] b, int ele, int i, int j)
    {
        if(j<b.length)
        {
            if(b[i]+b[j]==ele)
                System.out.println(b[i]+" "+b[j]);
            jLoop(b, ele, i,++j);
        }
    }
    private static void makeUniArr(int[] a, int[] b, int i, int index)
    {
        if(i<a.length)
        {
            boolean isUni=uniArr(a,b,i,0,true);
            if(isUni)
                b[index++]=a[i];
            makeUniArr(a,b,++i,index);
        }
    }
    private static boolean uniArr(int[] a,int[] b,int i, int j,boolean isUni)
    {
        if(j<i)
        {
            if(a[i]==a[j])
                isUni=false;
            return uniArr(a,b,i,++j,isUni);
        }
        return isUni;
    }
    private static int getCount(int[] a, int i,int count)
    {
        if(i<a.length)
        {
            boolean isUni=getUniCount(a, i,i+1,true);
            if(isUni)
                count++;
            return getCount(a,++i, count);
        }
        return count;
    }
    private static boolean getUniCount(int[] a, int i, int j, boolean isUni)
    {
        if(j<a.length)
        {
            if(a[i]==a[j])
                isUni=false;
            return getUniCount(a, i, ++j, isUni);
        }
        return isUni;
    }
}
