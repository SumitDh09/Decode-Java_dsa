package LeetcodeProblems;

import java.util.ArrayList;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        WordSubsets ws = new WordSubsets();
        String[] words1 = {"amazon", "apple", "facebook", "google", "leetcode"};
        String[] words2 = {"e", "o"};
        List<String> result = ws.wordSubsets(words1, words2);
        System.out.println(result); // Output: [facebook, google, leetcode]
    }

    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] maxFreq = new int[26];
        for (String b : words2) {
            int[] bFreq = countFreq(b);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], bFreq[i]);
            }
        }

        List<String> result = new ArrayList<>();
        for (String a : words1) {
            int[] aFreq = countFreq(a);
            boolean isUniversal = true;
            for (int i = 0; i < 26; i++) {
                if (aFreq[i] < maxFreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
            if (isUniversal) {
                result.add(a);
            }
        }

        return result;
    }

    private int[] countFreq(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }
}
