package LeetcodeProblems;

import java.util.Arrays;
import java.util.Comparator;

public class MaxTwoEvents {
    public static void main(String[] args) {
        MaxTwoEvents solution = new MaxTwoEvents();

        int[][] events1 = {{1, 3, 2}, {4, 5, 2}, {2, 4, 3}};
        System.out.println("Maximum sum of two non-overlapping events : " + solution.maxTwoEvents(events1)); // Expected output: 4

        int[][] events2 = {{1, 3, 2}, {4, 5, 2}, {1, 5, 5}};
        System.out.println("Maximum sum of two non-overlapping events : " + solution.maxTwoEvents(events2)); // Expected output: 5

        int[][] events3 = {{1, 5, 3}, {1, 5, 1}, {6, 6, 5}};
        System.out.println("Maximum sum of two non-overlapping events : " + solution.maxTwoEvents(events3)); // Expected output: 8
    }

    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(a -> a[1])); // Sort by end time

        int n = events.length;
        int[] dp = new int[n];
        dp[0] = events[0][2];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], events[i][2]);
        }

        int maxSum = dp[n - 1];

        for (int i = 0; i < n; i++) {
            int left = 0, right = i - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (events[mid][1] < events[i][0]) {
                    maxSum = Math.max(maxSum, events[i][2] + dp[mid]);
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return maxSum;
    }
}
