package LeetcodeProblems;

public class LongestSubarray1s {
    public static void main(String[] args) {
        LongestSubarray1s solution = new LongestSubarray1s();

        // Example test case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Longest subarray length (Test Case 1): " + solution.longestSubarray(nums1)); // Output: 5

        // Example test case 2
        int[] nums2 = {0, 1, 1, 0, 1};
        System.out.println("Longest subarray length (Test Case 2): " + solution.longestSubarray(nums2)); // Output: 4

        // Example test case 3
        int[] nums3 = {1, 1, 1};
        System.out.println("Longest subarray length (Test Case 3): " + solution.longestSubarray(nums3)); // Output: 3

        // Example test case 4
        int[] nums4 = {0, 0, 0};
        System.out.println("Longest subarray length (Test Case 4): " + solution.longestSubarray(nums4)); // Output: 0
    }

    public int longestSubarray(int[] nums) {
        int maxLength = 0;
        int left = 0;
        int zeroCount = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // If we have more than one zero, move the left pointer
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // Update maxLength, subtracting 1 to account for the zero we can remove
            maxLength = Math.max(maxLength, right - left);
        }

        return maxLength;
    }
}