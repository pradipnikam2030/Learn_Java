package Recursion;

public class RemoveDuplicateRec {
    public static void main(String[] args) {
        int[] a={1,2,3,2,3};
        remove(0, a);
    }

    private static void remove(int i, int[] a) {
        if (i<a.length)
        {
            int count=0;
            count= remove2(0, a, count,i);
            if (count==0)
                System.out.print(a[i]+" ");
            remove(++i, a);
        }
    }

    private static int remove2(int j, int[] a, int count, int i) {
        if (j<i)
        {
            if (a[i]==a[j])
                count++;
            return remove2(++j, a, count,i);
        }
        return count;
    }
}
