package Recursion;

public class StairPathfor1or3Jumps {
    public static int countWays(int n) {
        if (n == 0) {
            return 1; // Base case: starting stair
        } else if (n < 0) {
            return 0; // Base case: negative stairs
        } else {
            return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
        }
    }

    public static void main(String[] args) {
        int n = 4; // Example: find ways to reach the 4th stair
        System.out.println("Number of ways to reach the " + n + "th stair: " + countWays(n));
    }
}


