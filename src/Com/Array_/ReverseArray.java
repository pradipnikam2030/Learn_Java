package Com.Array_;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int []a={0,1,2,3,4,5,6,7,8,9};
      //  int []b=new int[a.length];
        //int bindex=0;
                int i=0;
                 int j=a.length-1;
        while(i<j)
        {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++; j--;
        }
//b[bindex++]=a[i];
for (int k=0;k<a.length; k++)
    System.out.println(a[k]);
    }
}
