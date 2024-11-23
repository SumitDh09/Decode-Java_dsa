package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;

public class MaxEqualRowsAfterFlips {
    public static void main(String[] args) {
        MaxEqualRowsAfterFlips obj = new MaxEqualRowsAfterFlips();
        int[][] matrix1 = {{0, 1}, {1, 1}};
        System.out.println("Maximum number of equal rows: " + obj.maxEqualRowsAfterFlips(matrix1)); // Expected output: 1

        int[][] matrix2 = {{0, 1}, {1, 0}};
        System.out.println("Maximum number of equal rows: " + obj.maxEqualRowsAfterFlips(matrix2)); // Expected output: 2

        int[][] matrix3 = {{0, 0, 0}, {0, 0, 1}, {1, 1, 0}};
        System.out.println("Maximum number of equal rows: " + obj.maxEqualRowsAfterFlips(matrix3)); // Expected output: 2
    }

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> patternCount = new HashMap<>();
        int maxRows = 0;

        for (int[] row : matrix) {
            StringBuilder pattern = new StringBuilder();
            StringBuilder complement = new StringBuilder();

            for (int cell : row) {
                pattern.append(cell);
                complement.append(cell == 0 ? 1 : 0);
            }

            String patternStr = pattern.toString();
            String complementStr = complement.toString();

            patternCount.put(patternStr, patternCount.getOrDefault(patternStr, 0) + 1);
            patternCount.put(complementStr, patternCount.getOrDefault(complementStr, 0) + 1);

            maxRows = Math.max(maxRows, patternCount.get(patternStr));
        }

        return maxRows;
    }
}
