package LeetcodeProblems;

import java.util.*;

class TrEeNode {
    int val;
    TrEeNode left;
    TrEeNode right;
    TrEeNode(int val) {
        this.val = val;
    }
}

public class MinimumTimeToVisitCellM2 {
    public static void main(String[] args) {
        MinimumTimeToVisitCellM2 solution = new MinimumTimeToVisitCellM2();

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
        if (grid[0][1] > 1 && grid[1][0] > 1)
            return -1;

        final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        final int m = grid.length;
        final int n = grid[0].length;
        Queue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0])) {
            { offer(new int[] {0, 0, 0}); } // (time, i, j)
        };
        boolean[][] seen = new boolean[m][n];
        seen[0][0] = true;

        while (!minHeap.isEmpty()) {
            final int time = minHeap.peek()[0];
            final int i = minHeap.peek()[1];
            final int j = minHeap.poll()[2];
            if (i == m - 1 && j == n - 1)
                return time;
            for (int[] dir : dirs) {
                final int x = i + dir[0];
                final int y = j + dir[1];
                if (x < 0 || x == m || y < 0 || y == n)
                    continue;
                if (seen[x][y])
                    continue;
                final int extraWait = (grid[x][y] - time) % 2 == 0 ? 1 : 0;
                final int nextTime = Math.max(time + 1, grid[x][y] + extraWait);
                minHeap.offer(new int[] {nextTime, x, y});
                seen[x][y] = true;
            }
        }

        throw new IllegalArgumentException();
    }
}
