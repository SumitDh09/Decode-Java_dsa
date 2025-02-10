package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfBadPairs {
    public static void main(String[] args) {
        CountNumberOfBadPairs sol = new CountNumberOfBadPairs();

        int[] nums1 = {4, 1, 3, 3};
        System.out.println(sol.countBadPairs(nums1)); // Output: 5

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(sol.countBadPairs(nums2)); // Output: 0
    }

    public long countBadPairs(int[] nums) {
        long totalPairs = 0;
        long badPairs = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - i;
            if (countMap.containsKey(diff)) {
                badPairs += countMap.get(diff);
            }
            countMap.put(diff, countMap.getOrDefault(diff, 0) + 1);
            totalPairs += i;
        }

        return totalPairs - badPairs;
    }
}

