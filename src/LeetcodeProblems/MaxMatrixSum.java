package LeetcodeProblems;

public class MaxMatrixSum {
    public static void main(String[] args) {
        MaxMatrixSum solution = new MaxMatrixSum();
        int[][] matrix1 = {{1, -1}, {-1, 1}};
        System.out.println("Maximum matrix sum: " + solution.maxMatrixSum(matrix1)); // Expected output: 4

        int[][] matrix2 = {{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}};
        System.out.println("Maximum matrix sum: " + solution.maxMatrixSum(matrix2)); // Expected output: 16
    }

    public int maxMatrixSum(int[][] matrix) {
        int n = matrix.length;
        int totalSum = 0;
        int minAbsValue = Integer.MAX_VALUE;
        int negativeCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                totalSum += Math.abs(matrix[i][j]);
                if (matrix[i][j] < 0) {
                    negativeCount++;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(matrix[i][j]));
            }
        }

        if (negativeCount % 2 == 0) {
            return totalSum;
        } else {
            return totalSum - 2 * minAbsValue;
        }
    }
}

