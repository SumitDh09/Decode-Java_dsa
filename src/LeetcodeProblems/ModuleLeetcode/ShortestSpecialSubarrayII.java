package LeetcodeProblems.ModuleLeetcode;

public class ShortestSpecialSubarrayII {
    private static final int kMaxBit = 30;

    public static void main(String[] args) {
        ShortestSpecialSubarrayII obj = new ShortestSpecialSubarrayII();
        int[] nums1 = {1, 2, 3};
        int k1 = 2;
        System.out.println("Shortest special subarray length for nums1: " + obj.minimumSubarrayLength(nums1, k1)); // Expected output: 1

        int[] nums2 = {2, 1, 8};
        int k2 = 10;
        System.out.println("Shortest special subarray length for nums2: " + obj.minimumSubarrayLength(nums2, k2)); // Expected output: 3

        int[] nums3 = {1, 2};
        int k3 = 0;
        System.out.println("Shortest special subarray length for nums3: " + obj.minimumSubarrayLength(nums3, k3)); // Expected output: 1
    }

    public int minimumSubarrayLength(int[] nums, int k) {
        final int kMax = 50;
        final int n = nums.length;
        int ans = n + 1;
        int ors = 0;
        int[] count = new int[kMax + 1];

        for (int l = 0, r = 0; r < n; ++r) {
            ors = orNum(ors, nums[r], count);
            while (ors >= k && l <= r) {
                ans = Math.min(ans, r - l + 1);
                ors = undoOrNum(ors, nums[l], count);
                ++l;
            }
        }

        return (ans == n + 1) ? -1 : ans;
    }

    private int orNum(int ors, int num, int[] count) {
        for (int i = 0; i < kMaxBit; ++i)
            if ((num >> i & 1) == 1 && ++count[i] == 1)
                ors += 1 << i;
        return ors;
    }

    private int undoOrNum(int ors, int num, int[] count) {
        for (int i = 0; i < kMaxBit; ++i)
            if ((num >> i & 1) == 1 && --count[i] == 0)
                ors -= 1 << i;
        return ors;
    }
}
