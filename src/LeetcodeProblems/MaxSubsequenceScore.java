package LeetcodeProblems;

import java.util.PriorityQueue;
import java.util.Arrays;
import java.util.Comparator;

public class MaxSubsequenceScore {
    public static void main(String[] args) {
        MaxSubsequenceScore solution = new MaxSubsequenceScore();

        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};
        int k = 3;
        System.out.println("Maximum possible score : " + solution.maxScore(nums1, nums2, k)); // Expected output: 12

        int[] nums1_2 = {4, 2, 3, 1, 1};
        int[] nums2_2 = {7, 5, 10, 9, 6};
        int k2 = 1;
        System.out.println("Maximum possible score : " + solution.maxScore(nums1_2, nums2_2, k2)); // Expected output: 30
    }

    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        Arrays.sort(pairs, Comparator.comparingInt(a -> -a[1]));

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        long sum = 0;
        long maxScore = 0;

        for (int i = 0; i < n; i++) {
            maxHeap.add(pairs[i][0]);
            sum += pairs[i][0];

            if (maxHeap.size() > k) {
                sum -= maxHeap.poll();
            }

            if (maxHeap.size() == k) {
                maxScore = Math.max(maxScore, sum * pairs[i][1]);
            }
        }

        return maxScore;
    }
}

