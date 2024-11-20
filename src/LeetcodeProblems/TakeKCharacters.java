package LeetcodeProblems;

public class TakeKCharacters {
    public static void main(String[] args) {
        TakeKCharacters obj = new TakeKCharacters();
        String s1 = "aabaaaacaabc";
        int k1 = 2;
        System.out.println("Minimum minutes for s1: " + obj.takeCharacters(s1, k1)); // Expected output: 8

        String s2 = "a";
        int k2 = 1;
        System.out.println("Minimum minutes for s2: " + obj.takeCharacters(s2, k2)); // Expected output: -1
    }

    public int takeCharacters(String s, int k) {
        int n = s.length();
        int[] count = new int[3]; // To count 'a', 'b', and 'c'
        int left = 0, right = 0, minMinutes = Integer.MAX_VALUE;

        // Count the total occurrences of 'a', 'b', and 'c'
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Check if it's possible to take k of each character
        if (count[0] < k || count[1] < k || count[2] < k) {
            return -1;
        }

        // Use a sliding window to find the minimum number of minutes
        while (right < n) {
            count[s.charAt(right) - 'a']--;
            while (count[0] < k || count[1] < k || count[2] < k) {
                count[s.charAt(left) - 'a']++;
                left++;
            }
            minMinutes = Math.min(minMinutes, n - (right - left + 1));
            right++;
        }

        return minMinutes;
    }
}
