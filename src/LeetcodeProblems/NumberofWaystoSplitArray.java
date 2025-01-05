package LeetcodeProblems;

public class NumberofWaystoSplitArray {
    public static void main(String[] args) {
        NumberofWaystoSplitArray solution = new NumberofWaystoSplitArray();
        int[] nums = {10, 4, -8, 7};
        System.out.println("Number of ways to split array: " + solution.waysToSplitArray(nums));

        int[] nums2 = {2, 3, 1, 0};
        System.out.println("Number of ways to split array: " + solution.waysToSplitArray(nums2));
    }

    public int waysToSplitArray(int[] nums) {
        long leftSum = 0, rightSum = 0;
        for (int num : nums) {
            rightSum += num;
        }

        int validSplits = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            rightSum -= nums[i];
            if (leftSum >= rightSum) {
                validSplits++;
            }
        }

        return validSplits;
    }
}
