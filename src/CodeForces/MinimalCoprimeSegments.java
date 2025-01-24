package CodeForces;

import java.util.Scanner;

public class MinimalCoprimeSegments {

    // Function to calculate GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            long l = scanner.nextLong();
            long r = scanner.nextLong();
            long count = 0;

            // Iterate through each starting point l'
            for (long start = l; start <= r; start++) {
                // Find the largest end point r' such that gcd(start, end) = 1
                long end = start;
                while (end <= r && gcd((int) start, (int) end) == 1) {
                    end++;
                }
                // Count the minimal coprime segment
                count += (end - start);
            }
            System.out.println(count);
        }
        scanner.close();
    }
}