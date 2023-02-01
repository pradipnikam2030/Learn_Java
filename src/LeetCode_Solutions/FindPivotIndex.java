package LeetCode_Solutions;
// Find Pivot Index...
//Given an array of integers nums, calculate the pivot index of this array.
//        The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
//        If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
//        Return the leftmost pivot index. If no such index exists, return -1.
//
//        Example 1:
//        Input: nums = [1,7,3,6,5,6]
//        Output: 3
//        Explanation:
//        The pivot index is 3.
//        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
//        Right sum = nums[4] + nums[5] = 5 + 6 = 11
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums={1,10,1,7,3,1};
        System.out.println("pivot index= "+pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {

        int Total_sum=0;
        for(int i=0; i<nums.length; i++)
            Total_sum+=nums[i];
        int leftsum=0;
        int rightsum=0;
        for(int i=0; i<nums.length; i++)
        {
            if(i!=0)
                leftsum+=nums[i-1];
            rightsum=Total_sum-leftsum-nums[i];


            if(leftsum==rightsum)
                return i;
        }
        return -1;
    }
}
