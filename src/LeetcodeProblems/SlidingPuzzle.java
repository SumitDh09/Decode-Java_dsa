package LeetcodeProblems;

import java.util.*;

public class SlidingPuzzle {
    public static void main(String[] args) {
        SlidingPuzzle solution = new SlidingPuzzle();
        int[][] board1 = {{1, 2, 3}, {4, 0, 5}};
        System.out.println("Least number of moves: " + solution.slidingPuzzle(board1)); // Expected output: 1

        int[][] board2 = {{1, 2, 3}, {5, 4, 0}};
        System.out.println("Least number of moves: " + solution.slidingPuzzle(board2)); // Expected output: -1

        int[][] board3 = {{4, 1, 2}, {5, 0, 3}};
        System.out.println("Least number of moves: " + solution.slidingPuzzle(board3)); // Expected output: 5
    }

    public int slidingPuzzle(int[][] board) {
        String target = "123450";
        String start = "";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                start += board[i][j];
            }
        }

        int[][] dirs = {{1, 3}, {0, 2, 4}, {1, 5}, {0, 4}, {1, 3, 5}, {2, 4}};
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        int moves = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String cur = queue.poll();
                if (cur.equals(target)) {
                    return moves;
                }
                int zeroIndex = cur.indexOf('0');
                for (int dir : dirs[zeroIndex]) {
                    String next = swap(cur, zeroIndex, dir);
                    if (!visited.contains(next)) {
                        queue.offer(next);
                        visited.add(next);
                    }
                }
            }
            moves++;
        }

        return -1;
    }

    private String swap(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
