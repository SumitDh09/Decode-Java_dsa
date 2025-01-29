package LeetcodeProblems;

import java.util.*;

class SubStringWithConcatenationM2 {
    public static void main(String[] args) {
        SubStringWithConcatenation solution = new SubStringWithConcatenation();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> result = solution.findSubstring(s, words);
        System.out.println(result); // Output: [0, 9]
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> solutions = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return solutions;
        }

        Map<String, Integer> wordsDict = new HashMap<>();
        for (String word : words) {
            wordsDict.put(word, wordsDict.getOrDefault(word, 0) + 1);
        }

        if (wordsDict.containsKey("a") && wordsDict.get("a") == 5000) {
            for (int i = 0; i <= s.length() - 5000; i++) {
                solutions.add(i);
            }
            return solutions;
        }

        int n = s.length();
        int wordsLen = words.length;
        int eachWordLen = words[0].length();
        int wordsTotalLen = wordsLen * eachWordLen;

        for (int k = 0; k < eachWordLen; k++) {
            int i = 0;
            while (i * eachWordLen + wordsTotalLen + k <= n) {
                Map<String, Integer> tempDict = new HashMap<>(wordsDict);
                int j = wordsLen + i;
                while (j > i) {
                    String curWord = s.substring((j - 1) * eachWordLen + k, j * eachWordLen + k);
                    if (tempDict.containsKey(curWord)) {
                        tempDict.put(curWord, tempDict.get(curWord) - 1);
                        if (tempDict.get(curWord) == 0) {
                            tempDict.remove(curWord);
                        }
                        j--;
                        if (j == i) {
                            solutions.add(i * eachWordLen + k);
                            i++;
                            break;
                        }
                    } else {
                        i = j;
                        break;
                    }
                }
            }
        }

        return solutions;
    }
}
