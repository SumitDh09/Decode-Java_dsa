package Basics;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the starting and ending numbers
        System.out.print("Enter the starting number (e.g., 10): ");
        int start = scanner.nextInt();
        System.out.print("Enter the ending number (e.g., 100): ");
        int end = scanner.nextInt();

        // Check if the starting number is less than the ending number
        if (start > end) {
            System.out.println("Starting number must be less than or equal to the ending number.");
            return;
        }

        int[] numbers = new int[end - start + 1];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = start + i;
        }

        // Print the array
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
