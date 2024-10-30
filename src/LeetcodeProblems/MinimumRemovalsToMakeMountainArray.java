package LeetcodeProblems;

import java.util.*;

public class MinimumRemovalsToMakeMountainArray {
    public static void main(String[] args) {
        MinimumRemovalsToMakeMountainArray obj = new MinimumRemovalsToMakeMountainArray();
        int[] nums1 = {2, 1, 1, 5, 6, 2, 3, 1};
        int[] nums2 = {4, 3, 2, 1, 1, 2, 3, 1};

        System.out.println("Minimum removals for nums1: " + obj.minimumMountainRemovals(nums1)); // Expected output: 3
        System.out.println("Minimum removals for nums2: " + obj.minimumMountainRemovals(nums2)); // Expected output: 4
    }

    public int minimumMountainRemovals(int[] nums) {
        int n = nums.length;
        int[] lis = new int[n]; // Longest Increasing Subsequence
        int[] lds = new int[n]; // Longest Decreasing Subsequence

        Arrays.fill(lis, 1);
        Arrays.fill(lds, 1);

        // Calculate LIS for each element
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
        }

        // Calculate LDS for each element
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j > i; j--) {
                if (nums[i] > nums[j]) {
                    lds[i] = Math.max(lds[i], lds[j] + 1);
                }
            }
        }

        int maxMountainLength = 0;
        for (int i = 1; i < n - 1; i++) {
            if (lis[i] > 1 && lds[i] > 1) {
                maxMountainLength = Math.max(maxMountainLength, lis[i] + lds[i] - 1);
            }
        }

        return n - maxMountainLength;
    }
}
