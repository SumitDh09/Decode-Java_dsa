package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class FindMissingPositive {
    public static void main(String[] args) {
        FindMissingPositive obj = new FindMissingPositive();
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};

        System.out.println("Missing number in nums1: " + obj.FindmissingNumber(nums1)); // Expected output: 2
        System.out.println("Missing number in nums2: " + obj.FindmissingNumber(nums2)); // Expected output: 3
    }

//    Using hashset or set
    public int FindmissingNumber(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int ele : nums) {
            set.add(ele);
        }
        for (int num = 1; num <= n + 1; num++) {
            if (!set.contains(num)) return num;
        }
        return -1; // Return -1 if no missing number is found
        //        return 456364;
    }
}


