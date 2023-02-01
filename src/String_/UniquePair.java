package String_;

public class UniquePair {
    public static void main(String[] args) {
        int[] a={1,1,1,2,3};
        a=removeDuplicate(a);
        for (int i=0; i<a.length; i++){
            for (int j=i+1; j<a.length; j++)
            {
                System.out.println(a[i]+" "+a[j]);
            }
        }
    }

    private static int[] removeDuplicate(int[] a) {
        int uniCount=getUniCount(a);
        int[] b=new int[uniCount];
        int index=0;
        for (int i=0; i<a.length; i++)
        {
            boolean result=presentInB(b, a[i]);
            if (!result)
                b[index++]=a[i];
        }
        return b;
    }

    private static boolean presentInB(int[] b, int num) {
        boolean present=false;
        for (int i=0; i<b.length; i++)
        {
            if (b[i]==num)
                return true;
        }
        return  false;
    }

    private static int getUniCount(int[] a) {

        return iwalaLoop(0, a, 0);
    }

    private static int iwalaLoop(int i, int[] a, int uniCount) {
        if (i<a.length)
        {
            int count= cheakCount(0, i, 0, a);
            if (count==0)
                uniCount++;
            return  iwalaLoop(++i, a, uniCount);
        }
        return uniCount;
    }

    private static int cheakCount(int j, int i, int count, int[] a) {
        if (j<i)
        {
            if (a[i]==a[j])
                count++;
           return cheakCount(++j, i, count,a);
        }
        return count;
    }
}
