package SlidingWindow;

import java.util.*;

public class PowerOfSubarraysII {
    public static void main(String[] args) {
        PowerOfSubarraysII obj = new PowerOfSubarraysII();
        int[] nums1 = {1, 2, 3, 4, 3, 2, 5};
        int k1 = 3;
        System.out.println("Power of subarrays for nums1: " + Arrays.toString(obj.resultsArray(nums1, k1))); // Expected output: [3, 4, -1, -1, -1]

        int[] nums2 = {2, 2, 2, 2, 2};
        int k2 = 4;
        System.out.println("Power of subarrays for nums2: " + Arrays.toString(obj.resultsArray(nums2, k2))); // Expected output: [-1, -1]

        int[] nums3 = {3, 2, 3, 2, 3, 2};
        int k3 = 2;
        System.out.println("Power of subarrays for nums3: " + Arrays.toString(obj.resultsArray(nums3, k3))); // Expected output: [-1, 3, -1, 3, -1]
    }

    public int[] resultsArray(int[] nums, int k) {
        final int n = nums.length;
        int[] ans = new int[n - k + 1];
        int start = 0;

        for (int i = 0; i < n; ++i) {
            if (i > 0 && nums[i] != nums[i - 1] + 1)
                start = i;
            if (i >= k - 1)
                ans[i - k + 1] = i - start + 1 >= k ? nums[i] : -1;
        }

        return ans;
    }
}
