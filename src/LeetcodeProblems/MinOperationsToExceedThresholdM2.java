package LeetcodeProblems;

import java.util.PriorityQueue;

public class MinOperationsToExceedThresholdM2 {
    public static void main(String[] args) {
        MinOperationsToExceedThresholdM2 sol = new MinOperationsToExceedThresholdM2();

        int[] nums1 = {2, 11, 10, 1, 3};
        int k1 = 10;
        System.out.println(sol.minOperations(nums1, k1)); // Output: 2

        int[] nums2 = {1, 1, 2, 4, 9};
        int k2 = 20;
        System.out.println(sol.minOperations(nums2, k2)); // Output: 4

        int[] nums3 = {1, 1, 1, 1};
        int k3 = 10;
        System.out.println(sol.minOperations(nums3, k3)); // Output: -1
    }

    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add((long) num);
        }
        long cnt = 0;
        while (pq.peek() < k) {
            if (pq.size() < 2) return -1; // if we don't have at least two elements, return -1
            long first = pq.poll();
            long second = pq.poll();
            long num = 2 * Math.min(first, second) + Math.max(first, second);
            pq.add(num);
            cnt++;
        }
        return (int) cnt;
    }
}
