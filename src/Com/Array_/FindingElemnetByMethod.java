package Com.Array_;

public class FindingElemnetByMethod {
    public static void main(String[] args) {
        int[] a = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int num = 66;
        if (contain(a, num) == 0)//here counter value will  come
            System.out.println("Not Present");
        else
            System.out.println("Present");


    }

    private static int contain(int a[], int num) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == num)
                return 1; // if a[i] is equal to num so directely retrun 1.
        }
        return 0;  //  if a[i] not equal to num so return 0
    }

}