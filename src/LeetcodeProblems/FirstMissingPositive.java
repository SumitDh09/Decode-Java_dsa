package LeetcodeProblems;

public class FirstMissingPositive {
    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int[] nums = {3, 4, -1, 1};
        System.out.println("The smallest missing positive integer is: " + firstMissingPositive.firstMissingPositive(nums)); // Output: 2
    }

    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Place each number in its right place
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1; // The first missing positive
            }
        }

        // If all numbers are in their place, return n + 1
        return n + 1;
    }
}