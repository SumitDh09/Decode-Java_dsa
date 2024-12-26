package LeetcodeProblems;

public class TargetSum {
    public static void main(String[] args) {
        TargetSum solution = new TargetSum();
        int[] nums1 = {1, 1, 1, 1, 1};
        int target1 = 3;
        System.out.println("Output for nums1: " + solution.findTargetSumWays(nums1, target1)); // Output: 5

        int[] nums2 = {1};
        int target2 = 1;
        System.out.println("Output for nums2: " + solution.findTargetSumWays(nums2, target2)); // Output: 1
    }

    public int findTargetSumWays(int[] nums, int target) {
        return calculate(nums, 0, 0, target);
    }

    private int calculate(int[] nums, int index, int sum, int target) {
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }
        int add = calculate(nums, index + 1, sum + nums[index], target);
        int subtract = calculate(nums, index + 1, sum - nums[index], target);
        return add + subtract;
    }
}
