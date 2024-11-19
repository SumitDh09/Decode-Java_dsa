package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;

class MaximumSubarraySumII {
    public static void main(String[] args) {
        MaximumSubarraySumII obj = new MaximumSubarraySumII();
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

    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;

        Map<Integer, Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        long sum = 0;

        while (j < n) {
            int elem = nums[j];
            if (map.containsKey(elem)) {
                while (i <= map.get(elem)) {
                    sum -= nums[i];
                    i++;
                }
            }

            map.put(elem, j);
            sum += elem;

            if (j - i + 1 == k) {
                ans = Math.max(ans, sum);
                map.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            j++;
        }

        return ans;
    }
}
