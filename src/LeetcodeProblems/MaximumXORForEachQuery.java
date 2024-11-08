package LeetcodeProblems;


import java.util.Arrays;

public class MaximumXORForEachQuery {
    public static void main(String[] args) {
        MaximumXORForEachQuery obj = new MaximumXORForEachQuery();
        int[] nums1 = {0, 1, 1, 3};
        int maximumBit1 = 2;
        System.out.println("Maximum XOR for each query (nums1): " + Arrays.toString(obj.getMaximumXor(nums1, maximumBit1))); // Expected output: [0, 3, 2, 3]

        int[] nums2 = {2, 3, 4, 7};
        int maximumBit2 = 3;
        System.out.println("Maximum XOR for each query (nums2): " + Arrays.toString(obj.getMaximumXor(nums2, maximumBit2))); // Expected output: [5, 2, 6, 5]
    }

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int[] answer = new int[n];
        int xor = 0;
        int maxXor = (1 << maximumBit) - 1;

        for (int num : nums) {
            xor ^= num;
        }

        for (int i = 0; i < n; i++) {
            answer[i] = xor ^ maxXor;
            xor ^= nums[n - 1 - i];
        }

        return answer;
    }
}

