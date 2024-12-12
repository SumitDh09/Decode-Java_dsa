package DynamicProgramming;

public class TribonacciM2 {
    public static void main(String[] args) {
        TribonacciM2 solution = new TribonacciM2();

        int n1 = 4;
        System.out.println("T(" + n1 + ") = " + solution.tribonacci(n1)); // Expected output: 4

        int n2 = 25;
        System.out.println("T(" + n2 + ") = " + solution.tribonacci(n2)); // Expected output: 1389537
    }

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}

