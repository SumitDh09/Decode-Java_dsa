package LeetcodeProblems;

import java.util.*;

class MinimumCostToMakeAtLeastOneValidPathM2 {
    private static final int[] DIRS = {0, 1, 0, -1, 0};

    public static void main(String[] args) {
        MinimumCostToMakeAtLeastOneValidPathM2 solution = new MinimumCostToMakeAtLeastOneValidPathM2();
        int[][] grid = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {1, 1, 1, 1},
                {2, 2, 2, 2}
        };
        System.out.println("Minimum cost: " + solution.minCost(grid)); // Output: 3
    }

    public int minCost(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] cost = new int[m][n];
        for (int[] row : cost) Arrays.fill(row, Integer.MAX_VALUE);
        Deque<int[]> deque = new ArrayDeque<>();
        deque.offer(new int[]{0, 0, 0});
        cost[0][0] = 0;

        while (!deque.isEmpty()) {
            int[] curr = deque.poll();
            int x = curr[0], y = curr[1], c = curr[2];
            for (int d = 1; d <= 4; d++) {
                int nx = x + DIRS[d - 1], ny = y + DIRS[d];
                if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                    int newCost = c + (grid[x][y] == d ? 0 : 1);
                    if (newCost < cost[nx][ny]) {
                        cost[nx][ny] = newCost;
                        if (grid[x][y] == d) {
                            deque.offerFirst(new int[]{nx, ny, newCost});
                        } else {
                            deque.offerLast(new int[]{nx, ny, newCost});
                        }
                    }
                }
            }
        }
        return cost[m - 1][n - 1];
    }
}
