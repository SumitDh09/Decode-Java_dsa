package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class NumberContainers {
    Map<Integer, Integer> m;
    Map<Integer, PriorityQueue<Integer>> d;

    public NumberContainers() {
        m = new HashMap<>();
        d = new HashMap<>();
    }

    public static void main(String[] args) {
        NumberContainers nc = new NumberContainers();

        System.out.println(nc.find(10));
        // Output: -1
        nc.change(2, 10);

        nc.change(1, 10);

        nc.change(3, 10);

        System.out.println(nc.find(10));
        // Output: 1

        nc.change(1, 20);

        System.out.println(nc.find(10));
        // Output: 2

        System.out.println(nc.find(20));
        // Output: 1
    }

    public void change(int i, int n) {
        if (m.containsKey(i) && m.get(i) == n)
            return;
            m.put(i, n);
        d.computeIfAbsent(n, k -> new PriorityQueue<>()).offer(i);
    }

    public int find(int n) {
        if (!d.containsKey(n)) return -1;
        PriorityQueue<Integer> pq = d.get(n);
        while (!pq.isEmpty() && m.get(pq.peek()) != n) pq.poll();
        return pq.isEmpty() ? -1 : pq.peek();
    }
}
