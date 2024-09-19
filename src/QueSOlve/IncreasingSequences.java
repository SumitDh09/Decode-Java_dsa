package QueSOlve;

import java.util.Scanner;

public class IncreasingSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        printIncreasingSequences(n, k);
    }

    public static void printIncreasingSequences(int n, int k) {
        int[] sequence = new int[k];
        generateSequences(n, k, 0, sequence);
    }

    public static void generateSequences(int n, int k, int index, int[] sequence) {
        if (index == k) {
            // Print the generated sequence
            for (int i = 0; i < k; i++) {
                System.out.print(sequence[i] + " ");
            }
            System.out.println();
            return;
        }

        int start = (index == 0) ? 1 : sequence[index - 1] + 1;

        for (int i = start; i <= n; i++) {
            sequence[index] = i;
            generateSequences(n, k, index + 1, sequence);
        }
    }
}
