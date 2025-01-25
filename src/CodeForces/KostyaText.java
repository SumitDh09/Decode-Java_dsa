package CodeForces;

import java.util.Scanner;

public class KostyaText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            String[] words = new String[n];
            for (int j = 0; j < n; j++) {
                words[j] = scanner.nextLine();
            }

            int totalLength = 0;
            int maxWords = 0;

            for (int j = 0; j < n; j++) {
                if (totalLength + words[j].length() <= m) {
                    totalLength += words[j].length();
                    maxWords++;
                } else {
                    break;
                }
            }

            System.out.println(maxWords);
        }

        scanner.close();
    }
}
