package LeetcodeProblems;

public class ShortestSpecialSubarray {
    public static void main(String[] args) {
        ShortestSpecialSubarray obj = new ShortestSpecialSubarray();
        int[] nums1 = {1, 2, 3};
        int k1 = 2;
        System.out.println("Shortest special subarray length for nums1: " + obj.shortestSubarray(nums1, k1)); // Expected output: 1

        int[] nums2 = {2, 1, 8};
        int k2 = 10;
        System.out.println("Shortest special subarray length for nums2: " + obj.shortestSubarray(nums2, k2)); // Expected output: 3

        int[] nums3 = {1, 2};
        int k3 = 0;
        System.out.println("Shortest special subarray length for nums3: " + obj.shortestSubarray(nums3, k3)); // Expected output: 1
    }

    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int currentOR = 0;
            for (int j = i; j < n; j++) {
                currentOR |= nums[j];
                if (currentOR >= k) {
                    minLength = Math.min(minLength, j - i + 1);
                    break;
                }
            }
        }

        return minLength == Integer.MAX_VALUE ? -1 : minLength;
    }
}
