package test2;

public class MaximumSum {
    public int findMaxmunSum(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Integer.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
