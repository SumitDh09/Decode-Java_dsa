package SlidingWindow;

public class MaxVowelsInSubstringII {

    public static void main(String[] args) {
        MaxVowelsInSubstringII solution = new MaxVowelsInSubstringII();

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
        boolean[] vowels = new boolean['z' + 1];
        vowels['u'] = true;
        vowels['e'] = true;
        vowels['i'] = true;
        vowels['o'] = true;
        vowels['a'] = true;

        char[] chars = s.toCharArray();
        int r = 0, maxN = 0;
        for (; r < k; r++) {
            if (vowels[chars[r]]) {
                maxN++;
            }
        }

        int len = s.length(), l = 0, n = maxN;
        for (; r < len; l++, r++) {
            if (vowels[chars[l]]) {
                n--;
            }
            if (vowels[chars[r]]) {
                n++;
            }
            if (n > maxN) {
                maxN = n;
            }
        }
        return maxN;
    }
}

