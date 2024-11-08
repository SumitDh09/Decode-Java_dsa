package LeetcodeProblems;


import java.util.Arrays;

public class CloseStrings {
    public static void main(String[] args) {
        CloseStrings obj = new CloseStrings();
        String word1 = "abc";
        String word2 = "bca";
        System.out.println("Are word1 and word2 close ? " + obj.closeStrings(word1, word2)); // Expected output: true

        word1 = "a";
        word2 = "aa";
        System.out.println("Are word1 and word2 close ? " + obj.closeStrings(word1, word2)); // Expected output: false

        word1 = "cabbba";
        word2 = "abbccc";
        System.out.println("Are word1 and word2 close ? " + obj.closeStrings(word1, word2)); // Expected output: true
    }

    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (char c : word1.toCharArray()) {
            count1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            count2[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if ((count1[i] == 0 && count2[i] != 0) || (count1[i] != 0 && count2[i] == 0)) {
                return false;
            }
        }

        Arrays.sort(count1);
        Arrays.sort(count2);

        return Arrays.equals(count1, count2);
    }
}

