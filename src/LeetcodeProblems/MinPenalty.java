package LeetcodeProblems;

import java.util.Arrays;

public class MinPenalty {
    public static void main(String[] args) {
        MinPenalty solution = new MinPenalty();

        int[] nums1 = {9};
        int maxOperations1 = 2;
        System.out.println("Minimum possible penalty: " + solution.minimumSize(nums1, maxOperations1)); // Expected output: 3

        int[] nums2 = {2, 4, 8, 2};
        int maxOperations2 = 4;
        System.out.println("Minimum possible penalty: " + solution.minimumSize(nums2, maxOperations2)); // Expected output: 2

        int[] nums3 = {7, 17};
        int maxOperations3 = 2;
        System.out.println("Minimum possible penalty: " + solution.minimumSize(nums3, maxOperations3)); // Expected output: 7
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canDivide(nums, maxOperations, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canDivide(int[] nums, int maxOperations, int maxSize) {
        int operations = 0;
        for (int num : nums) {
            if (num > maxSize) {
                operations += (num - 1) / maxSize;
            }
        }
        return operations <= maxOperations;
    }
}

