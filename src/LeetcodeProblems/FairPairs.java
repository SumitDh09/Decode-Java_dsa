package LeetcodeProblems;

import java.util.Arrays;

public class FairPairs {
    public static void main(String[] args) {
        FairPairs obj = new FairPairs();
        int[] nums1 = {0, 1, 7, 4, 4, 5};
        int lower1 = 3;
        int upper1 = 6;
        System.out.println("Number of fair pairs for nums1: " + obj.countFairPairs(nums1, lower1, upper1)); // Expected output: 6

        int[] nums2 = {1, 7, 9, 2, 5};
        int lower2 = 11;
        int upper2 = 11;
        System.out.println("Number of fair pairs for nums2: " + obj.countFairPairs(nums2, lower2, upper2)); // Expected output: 1
    }

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += countPairs(nums, i + 1, nums.length - 1, lower - nums[i], upper - nums[i]);
        }
        return count;
    }

    private long countPairs(int[] nums, int left, int right, int lower, int upper) {
        long count = 0;
        while (left <= right) {
            if (nums[left] + nums[right] < lower) {
                left++;
            } else if (nums[left] + nums[right] > upper) {
                right--;
            } else {
                count += right - left;
                left++;
            }
        }
        return count;
    }
}
