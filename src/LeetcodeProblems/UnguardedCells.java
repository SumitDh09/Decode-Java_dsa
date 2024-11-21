package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class UnguardedCells {
    public static void main(String[] args) {
        UnguardedCells obj = new UnguardedCells();
        int m1 = 4, n1 = 6;
        int[][] guards1 = {{0, 0}, {1, 1}, {2, 3}};
        int[][] walls1 = {{0, 1}, {2, 2}, {1, 4}};
        System.out.println("Number of unguarded cells: " + obj.countUnguarded(m1, n1, guards1, walls1)); // Expected output: 7

        int m2 = 3, n2 = 3;
        int[][] guards2 = {{1, 1}};
        int[][] walls2 = {{0, 1}, {1, 0}, {2, 1}, {1, 2}};
        System.out.println("Number of unguarded cells: " + obj.countUnguarded(m2, n2, guards2, walls2)); // Expected output: 4
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        boolean[][] grid = new boolean[m][n];
        Set<String> guardSet = new HashSet<>();
        Set<String> wallSet = new HashSet<>();

        // Mark guards and walls on the grid
        for (int[] guard : guards) {
            guardSet.add(guard[0] + "," + guard[1]);
        }
        for (int[] wall : walls) {
            wallSet.add(wall[0] + "," + wall[1]);
        }

        // Mark cells guarded by each guard
        for (int[] guard : guards) {
            int row = guard[0];
            int col = guard[1];

            // Guard sees north
            for (int i = row - 1; i >= 0; i--) {
                if (wallSet.contains(i + "," + col) || guardSet.contains(i + "," + col)) break;
                grid[i][col] = true;
            }

            // Guard sees south
            for (int i = row + 1; i < m; i++) {
                if (wallSet.contains(i + "," + col) || guardSet.contains(i + "," + col)) break;
                grid[i][col] = true;
            }

            // Guard sees west
            for (int j = col - 1; j >= 0; j--) {
                if (wallSet.contains(row + "," + j) || guardSet.contains(row + "," + j)) break;
                grid[row][j] = true;
            }

            // Guard sees east
            for (int j = col + 1; j < n; j++) {
                if (wallSet.contains(row + "," + j) || guardSet.contains(row + "," + j)) break;
                grid[row][j] = true;
            }
        }

        // Count unguarded cells
        int unguardedCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!grid[i][j] && !guardSet.contains(i + "," + j) && !wallSet.contains(i + "," + j)) {
                    unguardedCount++;
                }
            }
        }

        return unguardedCount;
    }
}
