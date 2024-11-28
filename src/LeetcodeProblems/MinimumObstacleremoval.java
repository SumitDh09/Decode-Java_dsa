package LeetcodeProblems;

import java.util.*;

public class MinimumObstacleremoval {
    private static final int[] DIRS = {0, 1, 0, -1, 0};

    public static void main(String[] args) {
        MinimumObstacleremoval solution = new MinimumObstacleremoval();
        int[][] grid1 = {{0, 1, 1}, {1, 1, 0}, {1, 1, 0}};
        System.out.println("Minimum obstacles to remove: " + solution.minimumObstacles(grid1)); // Expected output: 2

        int[][] grid2 = {{0, 1, 0, 0, 0}, {0, 1, 0, 1, 0}, {0, 0, 0, 1, 0}};
        System.out.println("Minimum obstacles to remove: " + solution.minimumObstacles(grid2)); // Expected output: 0
    }

    public int minimumObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dist = new int[m][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        dist[0][0] = 0;
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0});

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int x = curr[0];
            int y = curr[1];
            for (int i = 0; i < 4; i++) {
                int nx = x + DIRS[i];
                int ny = y + DIRS[i + 1];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    int newDist = dist[x][y] + grid[nx][ny];
                    if (newDist < dist[nx][ny]) {
                        dist[nx][ny] = newDist;
                        if (grid[nx][ny] == 0) {
                            deque.offerFirst(new int[]{nx, ny});
                        } else {
                            deque.offerLast(new int[]{nx, ny});
                        }
                    }
                }
            }
        }

        return dist[m - 1][n - 1];
    }
}
