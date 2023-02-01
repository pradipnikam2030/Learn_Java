package LeetCode_Solutions;

import java.util.Arrays;

// Running Sum of 1d Array
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//        Return the running sum of nums.
//        Example 1:
//        Input: nums = [1,2,3,4]
//        Output: [1,3,6,10]
//        Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class RunningArray_1 {
    public static void main(String[] args) {
       int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int[] a=new int[nums.length];
        int index=0;
        for(int i=0; i<nums.length; i++)
        {
            int sum=nums[i];
            for(int j=0; j<i; j++)
            {
                sum+=nums[j];
            }
            a[index++]=sum;
        }
        return a;
    }
}
