package LeetcodeProblems.GFG;

import java.util.LinkedList;
import java.util.Queue;

public class HighestPeak {
    public static void main(String[] args) {
        HighestPeak hp = new HighestPeak();
        int[][] isWater = {
                {0, 1},
                {0, 0}
        };
        int[][] result = hp.highestPeak(isWater);

        // Print the result
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] highestPeak(int[][] isWater) {
        int m = isWater.length;
        int n = isWater[0].length;
        int[][] height = new int[m][n];
        Queue<int[]> queue = new LinkedList<>();

        // Initialize the height matrix and add all water cells to the queue
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isWater[i][j] == 1) {
                    height[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    height[i][j] = -1; // Mark land cells with -1 initially
                }
            }
        }

        // Directions for moving north, east, south, and west
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Perform BFS from all water cells
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];

            for (int[] dir : directions) {
                int newX = x + dir[0];
                int newY = y + dir[1];

                if (newX >= 0 && newX < m && newY >= 0 && newY < n && height[newX][newY] == -1) {
                    height[newX][newY] = height[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }

        return height;
    }
}

