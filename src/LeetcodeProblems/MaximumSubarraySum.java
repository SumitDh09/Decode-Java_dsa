package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        MaximumSubarraySum obj = new MaximumSubarraySum();
        int[] nums1 = {1, 5, 4, 2, 9, 9, 9};
        int k1 = 3;
        System.out.println("Maximum subarray sum for nums1: " + obj.maximumSubarraySum(nums1, k1)); // Expected output: 15

        int[] nums2 = {4, 4, 4};
        int k2 = 3;
        System.out.println("Maximum subarray sum for nums2: " + obj.maximumSubarraySum(nums2, k2)); // Expected output: 0

        int[] nums3 = {1, 2, 3, 4, 5};
        int k3 = 2;
        System.out.println("Maximum subarray sum for nums3: " + obj.maximumSubarraySum(nums3, k3)); // Expected output: 9
    }

    public int maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        if (n < k) return 0;

        int maxSum = 0;
        int currentSum = 0;
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < k; i++) {
            if (window.contains(nums[i])) return 0;
            window.add(nums[i]);
            currentSum += nums[i];
        }

        maxSum = currentSum;

        for (int i = k; i < n; i++) {
            currentSum += nums[i] - nums[i - k];
            window.remove(nums[i - k]);
            if (window.contains(nums[i])) return 0;
            window.add(nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
