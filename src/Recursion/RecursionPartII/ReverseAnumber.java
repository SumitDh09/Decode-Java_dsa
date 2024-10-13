package Recursion.RecursionPartII;

public class ReverseAnumber {
    static int sum = 0;

    static void reve1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reve1(n / 10);
    }

    static int reve2(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + helper(n / 10, digits - 1);
    }

    public static void main(String[] args) {
        reve1(1234);
        System.out.println("Reverse using reve1: " + sum);
        sum = 0;  // Reset sum for next method
        System.out.println("Reverse using reve2: " + reve2(1534));
    }
}
