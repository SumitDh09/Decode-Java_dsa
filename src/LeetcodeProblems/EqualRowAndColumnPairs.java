package LeetcodeProblems;


import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {
        EqualRowAndColumnPairs obj = new EqualRowAndColumnPairs();
        int[][] grid1 = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };
        int[][] grid2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };

        System.out.println("Number of equal row & column pairs for grid1: " + obj.equalPairs(grid1));
        // Expected output: 1
        System.out.println("Number of equal row & column pairs for grid2: " + obj.equalPairs(grid2));
        // Expected output: 3
    }

    public int equalPairs(int[][] grid) {
        int n = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        int count = 0;

        // Store the frequency of each row in the map
        for (int i = 0; i < n; i++) {
            StringBuilder rowKey = new StringBuilder();
            for (int j = 0; j < n; j++) {
                rowKey.append(grid[i][j]).append(",");
            }
            rowMap.put(rowKey.toString(), rowMap.getOrDefault(rowKey.toString(), 0) + 1);
        }

        // Compare each column with the rows
        for (int j = 0; j < n; j++) {
            StringBuilder colKey = new StringBuilder();
            for (int i = 0; i < n; i++) {
                colKey.append(grid[i][j]).append(",");
            }
            count += rowMap.getOrDefault(colKey.toString(), 0);
        }

        return count;
    }
}

