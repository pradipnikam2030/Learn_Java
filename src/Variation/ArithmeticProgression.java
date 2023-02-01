package Variation;


/*Find the missing element from an ordered array arr[], consisting of N elements representing an Arithmetic Progression(AP).

        Note: There always exists an element which upon inserting into sequence forms Arithmetic progression.

        Example 1:

        Input:
        N = 6
        Arr[] = {2, 4, 8, 10, 12, 14}
        Output: 6
        Explanation: Actual AP should be
        2, 4, 6, 8, 10, 12, 14.

        Example 2:

        Input:
        N = 6
        Arr[] = {1, 6, 11, 16, 21, 31}
        Output: 26
        Explanation: Actual AP should be
        1, 6, 11, 16, 21, 26, 31.*/



public class ArithmeticProgression {
    public static void main(String[] args) {
        int[] arr= {2, 4, 8, 10, 12, 14};
        int n=arr.length;
        System.out.println(findMissing(arr, n));
    }
    static int findMissing(int[] arr, int n) {
        // code here
        int diff = (arr[n-1]-arr[0])/n;

        for(int i=1;i<n;i++){
            int  ans = arr[i-1] + diff;
            if(ans != arr[i]){
                return ans;
            }
        }
        return -1;
    }
}
