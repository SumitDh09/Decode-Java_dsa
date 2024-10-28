package LeetcodeProblems;

//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Set;
import java.util.*;

class LongestSquareStreak {
    public static void main(String[] args) {
        LongestSquareStreak obj = new LongestSquareStreak();
        int[] nums1 = {4, 3, 6, 16, 8, 2};
        int[] nums2 = {2, 3, 5, 6, 7};

        System.out.println("Longest square streak length in nums1: " + obj.longestSquareStreak(nums1)); // Output: 3
        System.out.println("Longest square streak length in nums2: " + obj.longestSquareStreak(nums2)); // Output: -1
    }

    public int longestSquareStreak(int[] nums) {
        Set<Integer> s = new LinkedHashSet<>();
        for (int i : nums) s.add(i);
        List<Integer> l = new ArrayList<>(s);
        long lon = 0;
        for (int i = 0; i < l.size(); i++) {
            int lo = 1;
            long ele = l.get(i);
            while (ele * ele <= Integer.MAX_VALUE && s.contains((int) (ele * ele))) {
                ele = ele * ele;
                lo += 1;
            }
            lon = Math.max(lon, lo);
        }
        return lon == 1 ? -1 : (int) lon;
    }
}
