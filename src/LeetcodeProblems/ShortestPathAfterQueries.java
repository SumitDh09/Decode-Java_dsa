package LeetcodeProblems;

import java.util.*;

public class ShortestPathAfterQueries {
    public static void main(String[] args) {
        ShortestPathAfterQueries solution = new ShortestPathAfterQueries();
        int n1 = 5;
        int[][] queries1 = {{2, 4}, {0, 2}, {0, 4}};
        System.out.println("Shortest paths: " + Arrays.toString(solution.shortestPathAfterQueries(n1, queries1)));
        // Expected output: [3, 2, 1]

        int n2 = 4;
        int[][] queries2 = {{0, 3}, {0, 2}};
        System.out.println("Shortest paths: " + Arrays.toString(solution.shortestPathAfterQueries(n2, queries2)));
        // Expected output: [1, 1]
    }

    public int[] shortestPathAfterQueries(int n, int[][] queries) {
        List<int[]>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int i = 0; i < n - 1; i++) {
            graph[i].add(new int[]{i + 1, 1});
        }

        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int u = queries[i][0];
            int v = queries[i][1];
            graph[u].add(new int[]{v, 1});
            answer[i] = dijkstra(graph, n);
        }

        return answer;
    }

    private int dijkstra(List<int[]>[] graph, int n) {
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{0, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int u = curr[0];
            int d = curr[1];

            if (d > dist[u]) continue;

            for (int[] neighbor : graph[u]) {
                int v = neighbor[0];
                int weight = neighbor[1];
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }

        return dist[n - 1] == Integer.MAX_VALUE ? -1 : dist[n - 1];
    }
}

