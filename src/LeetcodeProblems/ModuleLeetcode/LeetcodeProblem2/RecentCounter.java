package LeetcodeProblems.ModuleLeetcode.LeetcodeProblem2;

import java.util.LinkedList;
import java.util.Queue;

public class RecentCounter {
    private Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }

    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));    // Expected output: 1
        System.out.println(recentCounter.ping(100));  // Expected output: 2
        System.out.println(recentCounter.ping(3001)); // Expected output: 3
        System.out.println(recentCounter.ping(3002)); // Expected output: 3
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.peek() < t - 3000) {
            queue.poll();
        }
        return queue.size();
    }
}
