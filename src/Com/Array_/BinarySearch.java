package Com.Array_;

public class BinarySearch {
    public static void main(String[] args) {
        int []a={11,22,33,44,55,66,77,88,99};
        int num=4;
        int start=0;
        int end=a.length-1;
      //  int mid=(start+end)/2;
        while(start<=end)
        {
           int  mid=(start+end)/2;

              if (a[mid]==num)
              {
                  System.out.println(mid);
                 break;
              }
              else if (num>a[mid])
              {
                  start=mid+1;

              }
              else {
                  end = mid - 1;

              }
              if (start>end)
                  System.out.println("not found");
        }
    }
}
