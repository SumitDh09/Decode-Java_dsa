package LeetcodeProblems;

import java.util.Arrays;

class ThreeSumClosest {
    public static void main(String[] args) {
        ThreeSumClosest obj = new ThreeSumClosest();
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = obj.threeSumClosest(nums, target);
        System.out.println("Closest sum to target " + target + " is: " + result);
    }

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); // Sort the array in non-decreasing order
        int n = nums.length;
        int closestSum = Integer.MAX_VALUE; // Initialize closestSum to a large value
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1, right = n - 1; // Two pointers
            while (left < right) {
                int currSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currSum;
                }
                if (currSum < target) {
                    left++;
                } else if (currSum > target) {
                    right--;
                } else {
                    return closestSum; // If the sum exactly matches target, return immediately
                }
            }
        }
        return closestSum;
    }
}
