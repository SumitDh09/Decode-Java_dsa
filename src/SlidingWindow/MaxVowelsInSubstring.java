package SlidingWindow;

import java.util.*;

public class MaxVowelsInSubstring {
    public static void main(String[] args) {
        MaxVowelsInSubstring solution = new MaxVowelsInSubstring();

        String s1 = "abciiidef";
        int k1 = 3;
        System.out.println("Maximum number of vowels in any substring of length " + k1 + " : " + solution.maxVowels(s1, k1)); // Expected output: 3

        String s2 = "aeiou";
        int k2 = 2;
        System.out.println("Maximum number of vowels in any substring of length " + k2 + " : " + solution.maxVowels(s2, k2)); // Expected output: 2

        String s3 = "leetcode";
        int k3 = 3;
        System.out.println("Maximum number of vowels in any substring of length " + k3 + " : " + solution.maxVowels(s3, k3)); // Expected output: 2
    }

    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int currentVowels = 0;
        int n = s.length();

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Slide the window across the string
        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    // Helper function to check if a character is a vowel
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
