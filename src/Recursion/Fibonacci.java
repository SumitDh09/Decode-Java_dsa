package Recursion;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            // Base case
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
            // Recursive case
        }
    }

    public static void main(String[] args) {
        System.out.println("Fibonacci of 5 is: " + fibonacci(5));
        // Output: 5
    }
}


