package Com.Array_;

import java.util.Arrays;

public class FindUniqueArray {
    public static void main(String[] args) {
        int []a={1,1,1,2,3};
        int arraySize=0;
        for (int i=0; i<a.length;i++)
        {
           // int count=0;
            boolean flag=false;
            for (int j=0; j<i; j++)
            {
               if(a[i]==a[j]) {
                   flag=true; //count++;
                   break;
               }
            }

            if(!flag) //count==0)
                arraySize++;
        }
        int []uniqueArray=new int[arraySize];
        int index=0;
        for (int i=0; i<a.length; i++)
        {
            boolean flag1=false;
            for (int j=0; j<i; j++)
            {
                if (a[i]==a[j]) {
                    flag1=true;
                    break;
                }
            }
            if (!flag1)
            {
                uniqueArray[index++]=a[i];
            }
        }
        System.out.println(Arrays.toString(uniqueArray));
    }
}
