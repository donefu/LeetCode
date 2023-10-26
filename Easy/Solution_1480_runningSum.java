package Easy;

import java.util.Arrays;

/**
 * 1480_Running_Sum_of_1d_Array
 */
public class Solution_1480_runningSum {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(array)));
    }

    public static int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}