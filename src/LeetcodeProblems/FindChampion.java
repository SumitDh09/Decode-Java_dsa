package LeetcodeProblems;

import java.util.*;

public class FindChampion {
    public static void main(String[] args) {
        FindChampion solution = new FindChampion();
        int[][] edges1 = {{0, 1}, {1, 2}};
        System.out.println("Champion: " + solution.findChampion(3, edges1)); // Expected output: 0

        int[][] edges2 = {{0, 2}, {1, 3}, {1, 2}};
        System.out.println("Champion: " + solution.findChampion(4, edges2)); // Expected output: -1

        int[][] edges3 = {{0, 1}, {1, 3}, {2, 3}};
        System.out.println("Champion: " + solution.findChampion(4, edges3)); // Expected output: 0
    }

    public int findChampion(int n, int[][] edges) {
        int[] inDegree = new int[n];

        // Calculate in-degrees of all nodes
        for (int[] edge : edges) {
            inDegree[edge[1]]++;
        }

        int champion = -1;
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                if (champion == -1) {
                    champion = i;
                } else {
                    // More than one node with in-degree 0
                    return -1;
                }
            }
        }

        return champion;
    }
}

