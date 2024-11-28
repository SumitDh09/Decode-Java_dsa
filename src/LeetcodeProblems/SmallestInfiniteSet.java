package LeetcodeProblems;

import java.util.*;

public class SmallestInfiniteSet {
    private PriorityQueue<Integer> minHeap;
    private Set<Integer> addedBack;
    private int nextSmallest;

    public SmallestInfiniteSet() {
        minHeap = new PriorityQueue<>();
        addedBack = new HashSet<>();
        nextSmallest = 1;
    }

    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        System.out.println(smallestInfiniteSet.popSmallest()); // Expected output: 1
        System.out.println(smallestInfiniteSet.popSmallest()); // Expected output: 2
        smallestInfiniteSet.addBack(1);
        System.out.println(smallestInfiniteSet.popSmallest()); // Expected output: 1
        System.out.println(smallestInfiniteSet.popSmallest()); // Expected output: 3
        System.out.println(smallestInfiniteSet.popSmallest()); // Expected output: 4
    }

    public int popSmallest() {
        if (!minHeap.isEmpty()) {
            int smallest = minHeap.poll();
            addedBack.remove(smallest);
            return smallest;
        }
        return nextSmallest++;
    }

    public void addBack(int num) {
        if (num < nextSmallest && addedBack.add(num)) {
            minHeap.offer(num);
        }
    }
}
