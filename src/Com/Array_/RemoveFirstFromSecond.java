package Com.Array_;

public class RemoveFirstFromSecond {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 1,1, 1, 2, 33, 54, 6};
        int[] n = {1, 2, 3, 4};
        for (int i = 0; i < n.length; i++)
        for (int num:a)
            System.out.println(num+" ");
    }

    private static int[] removeElementFromArray(int[] a, int num) {
        int count=giveMeCount(a, num);
        if(count>2)
            count=2;
        int[] b=new int[a.length-count];
        int index=0;
        int counter=0;
        for (int i=0; i<a.length; i++) {
            if (counter == 2)
                b[index++] = a[i];
            else if (a[i] != num)
                b[index++] = a[i];
            else
                counter++;
        }
        return b;
    }

    private static int giveMeCount(int[] a, int num) {
        int count=0;
        for (int i=0; i<a.length; i++)
        {
            if (a[i]==num)
                count++;
        }
        return count;
    }
}