package LeetcodeProblems;

public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        MaxConsecutiveOnesIII solution = new MaxConsecutiveOnesIII();

        int[] nums1 = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k1 = 2;
        System.out.println("Maximum number of consecutive 1s : " + solution.longestOnes(nums1, k1)); // Expected output: 6

        int[] nums2 = {0, 0, 1, 1, 1, 0, 0};
        int k2 = 0;
        System.out.println("Maximum number of consecutive 1s : " + solution.longestOnes(nums2, k2)); // Expected output: 3

        int[] nums3 = {1, 1, 1, 1, 1};
        int k3 = 2;
        System.out.println("Maximum number of consecutive 1s : " + solution.longestOnes(nums3, k3)); // Expected output: 5
    }

    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int end = 0;
        int zeros = 0;

        while (end < nums.length) {
            if (nums[end] == 0) {
                zeros++;
            }
            end++;
            if (zeros > k) {
                if (nums[start] == 0) {
                    zeros--;
                }
                start++;
            }
        }
        return end - start;
    }
}

