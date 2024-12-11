package SlidingWindow;

public class MaxBeautyArray {
    public static void main(String[] args) {
        MaxBeautyArray solution = new MaxBeautyArray();

        int[] nums1 = {4, 6, 1, 2};
        int k1 = 2;
        System.out.println("Maximum possible beauty : " + solution.maximumBeauty(nums1, k1));
        // Expected output: 3

        int[] nums2 = {1, 1, 1, 1};
        int k2 = 10;
        System.out.println("Maximum possible beauty : " + solution.maximumBeauty(nums2, k2));
        // Expected output: 4

        int[] nums3 = {1, 3, 5, 7};
        int k3 = 1;
        System.out.println("Maximum possible beauty : " + solution.maximumBeauty(nums3, k3));
        // Expected output: 1
    }

    public int maximumBeauty(int[] nums, int k) {
        if (nums.length == 1)
            return 1;

        int maxBeauty = 0;
        int maxValue = 0;

        for (int num : nums)
            maxValue = Math.max(maxValue, num);

        int[] count = new int[maxValue + 1];

        for (int num : nums) {
            count[Math.max(num - k, 0)]++;
            count[Math.min(num + k + 1, maxValue)]--;
        }

        int currentSum = 0;

        for (int val : count) {
            currentSum += val;
            maxBeauty = Math.max(maxBeauty, currentSum);
        }

        return maxBeauty;
    }
}

