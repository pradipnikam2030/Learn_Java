package Recursion;

public class SecondMaxRec {
          public static void main(String[] args) {
        int[] a = {2, 4, 3, 5, 6, -2, 4, 7, 9, 8, 9};
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        max=iLoop(0, max, a);
        secMax=iLoop2(0, secMax, max, a);
        System.out.println(secMax);
       }
       private static int iLoop2(int i, int secMax, int max, int[] a)
       {
        if(i<a.length)
        {
            if(a[i]>secMax && a[i]!=max)
                secMax=a[i];
            return iLoop2(++i, secMax, max, a);
        }
        return secMax;
     }
       private static int iLoop(int i, int max, int[] a)
     {
        if(i<a.length)
        {
            if(a[i]>max)
                max=a[i]; return iLoop (++i, max, a);
        }
        return max;
     }
 }

