package LeetcodeProblems;

import java.util.*;


public class ContinousSubArrays {
    public static void main(String[] args) {
        ContinousSubArrays solution = new ContinousSubArrays();

        int[] nums1 = {1, 2, 3, 4};
        System.out.println("Total continuous subarrays : " + solution.continuousSubarrays(nums1)); // Expected output: 10

        int[] nums2 = {5, 4, 2, 4};
        System.out.println("Total continuous subarrays : " + solution.continuousSubarrays(nums2)); // Expected output: 8

        int[] nums3 = {1, 1, 1, 1};
        System.out.println("Total continuous subarrays : " + solution.continuousSubarrays(nums3)); // Expected output: 10
    }

    public long continuousSubarrays(int[] nums) {
        int n = nums.length;
        int j = 0;
        long cnt = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while ((i - j + 1) > getCount(nums[i], map)) {
                map.put(nums[j], map.get(nums[j]) - 1);
                j++;
            }

            cnt += (i - j + 1);
        }

        return cnt;
    }

    private int getCount(int num, Map<Integer, Integer> map) {
        return map.getOrDefault(num, 0) + map.getOrDefault(num - 1, 0) +
                map.getOrDefault(num + 1, 0) + map.getOrDefault(num - 2, 0) +
                map.getOrDefault(num + 2, 0);
    }
}

