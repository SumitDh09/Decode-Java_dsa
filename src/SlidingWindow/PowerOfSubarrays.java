package SlidingWindow;

import java.util.Arrays;

public class PowerOfSubarrays {
    public static void main(String[] args) {
        PowerOfSubarrays obj = new PowerOfSubarrays();
        int[] nums1 = {1, 2, 3, 4, 3, 2, 5};
        int k1 = 3;
        System.out.println("Power of subarrays for nums1: " + Arrays.toString(obj.findPowerOfSubarrays(nums1, k1))); // Expected output: [3, 4, -1, -1, -1]

        int[] nums2 = {2, 2, 2, 2, 2};
        int k2 = 4;
        System.out.println("Power of subarrays for nums2: " + Arrays.toString(obj.findPowerOfSubarrays(nums2, k2))); // Expected output: [-1, -1]

        int[] nums3 = {3, 2, 3, 2, 3, 2};
        int k3 = 2;
        System.out.println("Power of subarrays for nums3: " + Arrays.toString(obj.findPowerOfSubarrays(nums3, k3))); // Expected output: [-1, 3, -1, 3, -1]
    }

    public int[] findPowerOfSubarrays(int[] nums, int k) {
        int n = nums.length;
        int[] results = new int[n - k + 1];

        for (int i = 0; i <= n - k; i++) {
            boolean isSorted = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] >= nums[j + 1]) {
                    isSorted = false;
                    break;
                }
            }
            if (isSorted) {
                results[i] = nums[i + k - 1];
            } else {
                results[i] = -1;
            }
        }

        return results;
    }
}

