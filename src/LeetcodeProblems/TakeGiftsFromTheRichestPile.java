package LeetcodeProblems;

import java.util.Collections;
import java.util.PriorityQueue;

public class TakeGiftsFromTheRichestPile {
    public static void main(String[] args) {
        TakeGiftsFromTheRichestPile solution = new TakeGiftsFromTheRichestPile();

        int[] g1 = {25, 64, 9, 4, 100};
        int k1 = 4;
        System.out.println("Maximum possible sum of gifts : " + solution.pickGifts(g1, k1));
        // Expected output: 29

        int[] g2 = {1, 2, 3, 4, 5};
        int k2 = 2;
        System.out.println("Maximum possible sum of gifts : " + solution.pickGifts(g2, k2));
        // Expected output: 14

        int[] g3 = {10, 20, 30};
        int k3 = 3;
        System.out.println("Maximum possible sum of gifts : " + solution.pickGifts(g3, k3));
        // Expected output: 17
    }

    public long pickGifts(int[] g, int k) {
        // Create max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : g) maxHeap.add(val);

        for (int i = 0; i < k && maxHeap.peek() > 1; i++) {
            // Pop max element
            int x = maxHeap.poll();
            // Update element
            maxHeap.add((int) Math.sqrt(x));
        }

        // Return sum
        long sum = 0;
        for (int val : maxHeap) sum += val; return sum;
    }
}

/*
Using takes user input
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class TakeGiftsFromTheRichestPile {
    public long pickGifts(int[] g, int k) {
        // Create max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int val : g) maxHeap.add(val);

        for (int i = 0; i < k && maxHeap.peek() > 1; i++) {
            // Pop max element
            int x = maxHeap.poll();
            // Update element
            maxHeap.add((int) Math.sqrt(x));
        }

        // Return sum
        long sum = 0;
        for (int val : maxHeap) sum += val;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] g = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            g[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        TakeGiftsFromTheRichestPile solution = new TakeGiftsFromTheRichestPile();
        long result = solution.pickGifts(g, k);
        System.out.println("Maximum possible sum of gifts: " + result);
    }
}

 */
