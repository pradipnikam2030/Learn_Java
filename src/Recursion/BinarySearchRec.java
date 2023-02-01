package Recursion;

public class BinarySearchRec {
    public static void main(String[] args) {
        int []a={11,22,33,44,55,66,77,88,99};
        int num=44;
        int start=0;
        int end=a.length-1;
        search(start, end, a,num);
    }

    private static void search(int start, int end, int[] a, int num) {
        if (start<=end)
        {
            int  mid=(start+end)/2;
            if (a[mid]==num)
            {
                System.out.println(mid);
                return;
            }
            else if (num>a[mid])
                start=mid+1;
            else
                end = mid - 1;
            search(start, end, a,num);
        }
        else
            System.out.println("not found");
    }
}
