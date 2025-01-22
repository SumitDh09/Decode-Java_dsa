package CodeForces;

import java.util.Scanner;

public class Fibonacciness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a1 = scanner.nextInt();
            int a2 = scanner.nextInt();
            int a4 = scanner.nextInt();
            int a5 = scanner.nextInt();

            int maxFibonacciness = 0;

            // Check all possible values of a3
            for (int a3 = -100; a3 <= 100; a3++) {
                int fibonacciness = 0;

                if (a3 == a1 + a2) fibonacciness++;
                if (a4 == a2 + a3) fibonacciness++;
                if (a5 == a3 + a4) fibonacciness++;

                maxFibonacciness = Math.max(maxFibonacciness, fibonacciness);
            }

            System.out.println(maxFibonacciness);
        }

        scanner.close();
    }
}
