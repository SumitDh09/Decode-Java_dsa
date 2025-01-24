package LeetcodeProblems;

import java.util.*;

public class SafeNodes {
    public static void main(String[] args) {
        int[][] graph = {
                {1, 2},
                {2, 3},
                {5},
                {0},
                {5},
                {},
                {}
        };

        List<Integer> safeNodes = eventualSafeNodes(graph);
        System.out.println(safeNodes);
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] outdegree = new int[n];
        List<Integer>[] reverseGraph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            reverseGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n; i++) {
            for (int neighbor : graph[i]) {
                reverseGraph[neighbor].add(i);
                outdegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (outdegree[i] == 0) {
                queue.add(i);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();
        while (!queue.isEmpty()) {
            int node = queue.poll();
            safeNodes.add(node);
            for (int neighbor : reverseGraph[node]) {
                outdegree[neighbor]--;
                if (outdegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        Collections.sort(safeNodes);
        return safeNodes;
    }
}

