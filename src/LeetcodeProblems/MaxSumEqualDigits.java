package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MaxSumEqualDigits {
    public static void main(String[] args) {
        MaxSumEqualDigits solution = new MaxSumEqualDigits();

        int[] nums1 = {18, 43, 36, 13, 7};
        System.out.println(solution.maximumSum(nums1)); // Output: 54

        int[] nums2 = {10, 12, 19, 14};
        System.out.println(solution.maximumSum(nums2)); // Output: -1
    }

    // Function to calculate the sum of digits of a number
    private int digitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxSum = -1;

        for (int num : nums) {
            int sum = digitSum(num);
            if (map.containsKey(sum)) {
                maxSum = Math.max(maxSum, map.get(sum) + num);
            }
            map.put(sum, Math.max(map.getOrDefault(sum, 0), num));
        }

        return maxSum;
    }
}

