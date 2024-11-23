package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

class MaxEqualRowsAfterFlipsII {
    public static void main(String[] args) {
        MaxEqualRowsAfterFlipsII obj = new MaxEqualRowsAfterFlipsII();
        int[][] matrix1 = {{0, 1}, {1, 1}};
        System.out.println("Maximum number of equal rows: " + obj.maxEqualRowsAfterFlips(matrix1)); // Expected output: 1

        int[][] matrix2 = {{0, 1}, {1, 0}};
        System.out.println("Maximum number of equal rows: " + obj.maxEqualRowsAfterFlips(matrix2)); // Expected output: 2

        int[][] matrix3 = {{0, 0, 0}, {0, 0, 1}, {1, 1, 0}};
        System.out.println("Maximum number of equal rows: " + obj.maxEqualRowsAfterFlips(matrix3)); // Expected output: 2
    }

    public int maxEqualRowsAfterFlips(int[][] matrix) {
        final int m = matrix.length;
        final int n = matrix[0].length;
        int ans = 0;
        int[] flip = new int[n];
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < m; ++i) {
            if (seen.contains(i))
                continue;
            int count = 0;
            for (int j = 0; j < n; ++j)
                flip[j] = 1 ^ matrix[i][j];
            for (int k = 0; k < m; ++k)
                if (Arrays.equals(matrix[k], matrix[i]) || Arrays.equals(matrix[k], flip)) {
                    seen.add(k);
                    ++count;
                }
            ans = Math.max(ans, count);
        }

        return ans;
    }
}

