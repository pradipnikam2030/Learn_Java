package String_;

import java.util.Arrays;
//#Born_Developer
public class FindUniquePair {
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
        for (int i=0; i<b.length; i++)
        {
            if (b[i]==num)
                return true;
        }
        return  false;
    }

    private static int getUniCount(int[] a) {
        int uniCount=0;
        for (int i=0; i<a.length; i++)
        {
            int count=0;
            for (int j=0; j<i; j++)
            {
                if (a[i]==a[j])
                    count++;
            }
            if (count==0)
                uniCount++;
        }
        return uniCount;
    }
}
