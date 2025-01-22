package CodeForces;

import java.util.Scanner;

public class WordAbbreviation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            System.out.println(abbreviate(word));
        }

        scanner.close();
    }

    private static String abbreviate(String word) {
        int length = word.length();
        if (length > 10) {
            return word.charAt(0) + String.valueOf(length - 2) + word.charAt(length - 1);
        } else {
            return word;
        }
    }
}

