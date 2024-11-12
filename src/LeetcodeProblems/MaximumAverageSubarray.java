package LeetcodeProblems;

public class MaximumAverageSubarray {
    public static void main(String[] args) {
        MaximumAverageSubarray obj = new MaximumAverageSubarray();
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        System.out.println("Maximum average for nums1: " + obj.findMaxAverage(nums1, k1)); // Expected output: 12.75

        int[] nums2 = {5};
        int k2 = 1;
        System.out.println("Maximum average for nums2: " + obj.findMaxAverage(nums2, k2)); // Expected output: 5.0
    }

    public double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        double currentSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum / k;
    }
}

