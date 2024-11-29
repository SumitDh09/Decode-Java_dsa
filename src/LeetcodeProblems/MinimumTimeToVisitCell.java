package LeetcodeProblems;

import java.util.*;

public class MinimumTimeToVisitCell {
    private static final int[] DIRS = {0, 1, 0, -1, 0};

    public static void main(String[] args) {
        MinimumTimeToVisitCell solution = new MinimumTimeToVisitCell();
        int[][] grid1 = {
                {0, 1, 3, 2},
                {5, 1, 2, 5},
                {4, 3, 8, 6}
        };
        System.out.println("Minimum time to visit bottom-right cell: " + solution.minimumTime(grid1)); // Expected output: 7

        int[][] grid2 = {
                {0, 2, 4},
                {3, 2, 1},
                {1, 0, 4}
        };
        System.out.println("Minimum time to visit bottom-right cell: " + solution.minimumTime(grid2)); // Expected output: -1
    }

    public int minimumTime(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
        pq.offer(new int[]{0, 0, 0});

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int x = curr[0];
            int y = curr[1];
            int time = curr[2];

            if (x == m - 1 && y == n - 1) {
                return time;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + DIRS[i];
                int ny = y + DIRS[i + 1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    int newTime = Math.max(time + 1, grid[nx][ny]);
                    if (newTime < dist[nx][ny]) {
                        dist[nx][ny] = newTime;
                        pq.offer(new int[]{nx, ny, newTime});
                    }
                }
            }
        }

        return -1;
    }
}
