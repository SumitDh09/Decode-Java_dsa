package LeetcodeProblems;

import java.util.PriorityQueue;

public class MinOperationsToExceedThreshold {
    public static void main(String[] args) {
        MinOperationsToExceedThreshold sol = new MinOperationsToExceedThreshold();

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
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
        }
        int operations = 0;
        while (pq.size() > 1 && pq.peek() < k) {
            int x = pq.poll();
            int y = pq.poll();
            pq.offer(2 * x + y);
            operations++;
        }
        return pq.peek() >= k ? operations : -1;
    }
}

