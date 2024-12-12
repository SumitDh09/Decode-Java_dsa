package LeetcodeProblems;

import java.util.PriorityQueue;

public class HireWorkers {
    public static void main(String[] args) {
        HireWorkers solution = new HireWorkers();

        int[] costs1 = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int k1 = 3;
        int candidates1 = 4;
        System.out.println("Total cost to hire " + k1 + " workers : " + solution.totalCost(costs1, k1, candidates1));
        // Expected output: 11

        int[] costs2 = {1, 2, 4, 1};
        int k2 = 3;
        int candidates2 = 3;
        System.out.println("Total cost to hire " + k2 + " workers : " + solution.totalCost(costs2, k2, candidates2));
        // Expected output: 4
    }

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        int n = costs.length;

        // Add the first and last 'candidates' workers to the heaps
        for (int i = 0; i < candidates; i++) {
            leftHeap.add(costs[i]);
        }
        for (int i = Math.max(candidates, n - candidates); i < n; i++) {
            rightHeap.add(costs[i]);
        }

        long totalCost = 0;
        int leftIndex = candidates;
        int rightIndex = n - candidates - 1;

        // Hire k workers
        for (int i = 0; i < k; i++) {
            if (!leftHeap.isEmpty() && (rightHeap.isEmpty() || leftHeap.peek() <= rightHeap.peek())) {
                totalCost += leftHeap.poll();
                if (leftIndex <= rightIndex) {
                    leftHeap.add(costs[leftIndex++]);
                }
            } else {
                totalCost += rightHeap.poll();
                if (leftIndex <= rightIndex) {
                    rightHeap.add(costs[rightIndex--]);
                }
            }
        }

        return totalCost;
    }
}

