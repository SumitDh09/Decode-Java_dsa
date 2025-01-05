package LeetcodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelStringsinRanges {
    public static void main(String[] args) {
        CountVowelStringsinRanges solution = new CountVowelStringsinRanges();
        String[] words = {"apple", "banana", "orange"};
        int[][] queries = {{0, 1}, {1, 2}};
        System.out.println("Vowel strings count: " + Arrays.toString(solution.vowelStrings(words, queries)));

        String[] words2 = {"umbrella", "elephant", "iguana"};
        int[][] queries2 = {{0, 2}, {1, 2}};
        System.out.println("Vowel strings count: " + Arrays.toString(solution.vowelStrings(words2, queries2)));
    }

    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] Prefix = new int[n + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            Prefix[i + 1] = Prefix[i];
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                Prefix[i + 1]++;
            }
        }

        int[] ANS = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ANS[i] = Prefix[queries[i][1] + 1] - Prefix[queries[i][0]];
        }
        return ANS;
    }
}
