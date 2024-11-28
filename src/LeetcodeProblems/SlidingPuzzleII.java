package LeetcodeProblems;

import java.util.*;

class SlidingPuzzleII {
    public static void main(String[] args) {
        SlidingPuzzleII solution = new SlidingPuzzleII();
        int[][] board1 = {{1, 2, 3}, {4, 0, 5}};
        System.out.println("Least number of moves: " + solution.slidingPuzzle(board1)); // Expected output: 1

        int[][] board2 = {{1, 2, 3}, {5, 4, 0}};
        System.out.println("Least number of moves: " + solution.slidingPuzzle(board2)); // Expected output: -1

        int[][] board3 = {{4, 1, 2}, {5, 0, 3}};
        System.out.println("Least number of moves: " + solution.slidingPuzzle(board3)); // Expected output: 5
    }

    public int slidingPuzzle(int[][] board) {
        final int[][] dirs = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        final int m = 2;
        final int n = 3;
        final String goal = "123450";
        StringBuilder startSb = new StringBuilder();

        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                startSb.append((char) ('0' + board[i][j]));

        final String start = startSb.toString();
        if (start.equals(goal))
            return 0;

        Queue<String> q = new ArrayDeque<>(List.of(start));
        Set<String> seen = new HashSet<>(Arrays.asList(start));

        for (int step = 1; !q.isEmpty(); ++step)
            for (int sz = q.size(); sz > 0; --sz) {
                final String s = q.poll();
                final int zeroIndex = s.indexOf("0");
                final int i = zeroIndex / n;
                final int j = zeroIndex % n;
                for (int[] dir : dirs) {
                    final int x = i + dir[0];
                    final int y = j + dir[1];
                    if (x < 0 || x == m || y < 0 || y == n)
                        continue;
                    final int swappedIndex = x * n + y;
                    StringBuilder sb = new StringBuilder(s);
                    sb.setCharAt(zeroIndex, s.charAt(swappedIndex));
                    sb.setCharAt(swappedIndex, s.charAt(zeroIndex));
                    final String t = sb.toString();
                    if (t.equals(goal))
                        return step;
                    if (!seen.contains(t)) {
                        q.offer(t);
                        seen.add(t);
                    }
                }
            }

        return -1;
    }
}