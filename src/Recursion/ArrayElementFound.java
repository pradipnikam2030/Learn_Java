package Recursion;

public class ArrayElementFound {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int ele=57;
        int cnt=0;
        cnt=iLoop(a, 0, ele, cnt);
        if (cnt==0)
            System.out.println("not found");
        else
            System.out.println("found");
    }

    private static int iLoop(int[] a, int i, int ele, int cnt) {
        if (i<a.length)
        {
            if (a[i]==ele) {
                cnt++;
            }
            i++;
            return iLoop(a, i, ele, cnt);
        }
        return cnt;
    }
}
