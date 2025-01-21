package LeetcodeProblems;

class GridGame {
    public static void main(String[] args) {
        GridGame game = new GridGame();
        int[][] grid1 = {{2, 5, 4}, {1, 5, 1}};
        int[][] grid2 = {{3, 3, 1}, {8, 5, 2}};
        int[][] grid3 = {{1, 3, 1, 15}, {1, 3, 3, 1}};

        System.out.println(game.gridGame(grid1)); // Output: 4
        System.out.println(game.gridGame(grid2)); // Output: 4
        System.out.println(game.gridGame(grid3)); // Output: 7
    }

    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long[] topPrefixSum = new long[n + 1];
        long[] bottomPrefixSum = new long[n + 1];

        // Calculate prefix sums for the top and bottom rows
        for (int i = 0; i < n; i++) {
            topPrefixSum[i + 1] = topPrefixSum[i] + grid[0][i];
            bottomPrefixSum[i + 1] = bottomPrefixSum[i] + grid[1][i];
        }

        long result = Long.MAX_VALUE;

        // Calculate the minimum points the second robot can collect
        for (int i = 0; i < n; i++) {
            long pointsIfFirstRobotGoesDownHere = Math.max(topPrefixSum[n] - topPrefixSum[i + 1], bottomPrefixSum[i]);
            result = Math.min(result, pointsIfFirstRobotGoesDownHere);
        }

        return result;
    }
}

