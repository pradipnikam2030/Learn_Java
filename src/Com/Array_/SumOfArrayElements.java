package Com.Array_;

public class SumOfArrayElements {
    public static void main(String[] args) {
//arrays82
        int arr1[] = { 11, 22, 33 };
        int arr2[] = { 11, 22, 33, 44, 55 };
        int ptr[];
        ptr = arr1;
        arr1 = arr2;
        arr2 = ptr;
        System.out.print(arr1.length + " ");
        System.out.println(arr2.length);
    }


}
