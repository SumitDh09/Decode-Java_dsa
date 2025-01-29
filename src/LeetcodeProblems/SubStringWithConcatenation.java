package LeetcodeProblems;

import java.util.*;

class SubStringWithConcatenation {
    public static void main(String[] args) {
        SubStringWithConcatenation solution = new SubStringWithConcatenation();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> result = solution.findSubstring(s, words);
        System.out.println(result); // Output: [0, 9]
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordCount = words.length;
        int totalLength = wordLength * wordCount;

        // Create a frequency map for the words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        // Traverse the string
        for (int i = 0; i <= s.length() - totalLength; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            int j = 0;
            while (j < wordCount) {
                int wordIndex = i + j * wordLength;
                String word = s.substring(wordIndex, wordIndex + wordLength);
                if (!wordMap.containsKey(word)) {
                    break;
                }
                seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                if (seenWords.get(word) > wordMap.get(word)) {
                    break;
                }
                j++;
            }
            if (j == wordCount) {
                result.add(i);
            }
        }

        return result;
    }
}

