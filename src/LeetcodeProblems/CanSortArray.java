package LeetcodeProblems;

import java.util.*;

public class CanSortArray {
    public static void main(String[] args) {
        CanSortArray obj = new CanSortArray();
        int[] nums1 = {8, 4, 2, 30, 15};
        int[] nums2 = {1, 2, 3, 4, 5};
        int[] nums3 = {3, 16, 8, 4, 2};

        System.out.println("Can nums1 be sorted? " + obj.canSortArray(nums1)); // Expected output: true
        System.out.println("Can nums2 be sorted? " + obj.canSortArray(nums2)); // Expected output: true
        System.out.println("Can nums3 be sorted? " + obj.canSortArray(nums3)); // Expected output: false
    }

    public boolean canSortArray(int[] nums) {
        Map<Integer, List<Integer>> bitGroups = new HashMap<>();

        for (int num : nums) {
            int bitCount = Integer.bitCount(num);
            bitGroups.putIfAbsent(bitCount, new ArrayList<>());
            bitGroups.get(bitCount).add(num);
        }

        List<Integer> sortedArray = new ArrayList<>();
        for (List<Integer> group : bitGroups.values()) {
            Collections.sort(group);
            sortedArray.addAll(group);
        }

        for (int i = 1; i < sortedArray.size(); i++) {
            if (sortedArray.get(i) < sortedArray.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
