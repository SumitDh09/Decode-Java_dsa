package LeetcodeProblems;

class MaxMatrixSumII {
    public static void main(String[] args) {
        MaxMatrixSumII solution = new MaxMatrixSumII();

        int[][] matrix1 = {{1, -1}, {-1, 1}};
        System.out.println("Maximum matrix sum: " + solution.maxMatrixSum(matrix1)); // Expected output: 4

        int[][] matrix2 = {{1, 2, 3}, {-1, -2, -3}, {1, 2, 3}};
        System.out.println("Maximum matrix sum: " + solution.maxMatrixSum(matrix2)); // Expected output: 16

        int[][] matrix3 = {{-1, -2, -3}, {-4, -5, -6}, {-7, -8, -9}};
        System.out.println("Maximum matrix sum: " + solution.maxMatrixSum(matrix3)); // Expected output: 45
    }

    public long maxMatrixSum(int[][] matrix) {
        long absSum = 0;
        int minAbs = Integer.MAX_VALUE;
        // 0 := even number of negatives
        // 1 := odd number of negatives
        int oddNeg = 0;

        for (int[] row : matrix)
            for (final int num : row) {
                absSum += Math.abs(num);
                minAbs = Math.min(minAbs, Math.abs(num));
                if (num < 0) oddNeg ^= 1;
            }

        return absSum - oddNeg*minAbs * 2;
    }
}
