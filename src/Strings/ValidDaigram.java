package Strings;

import java.util.HashMap;

public class ValidDaigram {

    public static boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create frequency count maps for both strings
        HashMap<Character, Integer> countMapS = new HashMap<>();
        HashMap<Character, Integer> countMapT = new HashMap<>();

        // Count frequency of each character in s
        for (char ch : s.toCharArray()) {
            countMapS.put(ch, countMapS.getOrDefault(ch, 0) + 1);
        }

        // Count frequency of each character in t
        for (char ch : t.toCharArray()) {
            countMapT.put(ch, countMapT.getOrDefault(ch, 0) + 1);
        }

        // Compare the two maps
        return countMapS.equals(countMapT);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("hello", "world")); // false
    }
}


