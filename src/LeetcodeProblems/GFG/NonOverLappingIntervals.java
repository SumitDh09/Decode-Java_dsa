package LeetcodeProblems.GFG;

import java.util.Arrays;

public class NonOverLappingIntervals {
    public static void main(String[] args) {
        NonOverLappingIntervals obj = new NonOverLappingIntervals();
        int[][] intervals1 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        System.out.println("Minimum number of intervals to remove for intervals:-1: " + obj.eraseOverlapIntervals(intervals1)); // Expected output: 1

        int[][] intervals2 = {{1, 2}, {1, 2}, {1, 2}};
        System.out.println("Minimum number of intervals to remove for intervals:-2: " + obj.eraseOverlapIntervals(intervals2)); // Expected output: 2

        int[][] intervals3 = {{1, 2}, {2, 3}};
        System.out.println("Minimum number of intervals to remove for intervals:-3 : " + obj.eraseOverlapIntervals(intervals3)); // Expected output: 0
    }

    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }

        // Sort intervals by their end times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                count++;
            } else {
                end = intervals[i][1];
            }
        }

        return count;
    }
}

