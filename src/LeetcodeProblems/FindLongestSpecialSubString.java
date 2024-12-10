package LeetcodeProblems;

public class FindLongestSpecialSubString {
    public static void main(String[] args) {
        FindLongestSpecialSubString solution = new FindLongestSpecialSubString();

        String s1 = "aaaa";
        System.out.println("Maximum length of special substring : " + solution.maximumLength(s1));
        // Expected output: 2

        String s2 = "abcdef";
        System.out.println("Maximum length of special substring : " + solution.maximumLength(s2));
        // Expected output: -1

        String s3 = "abcaba";
        System.out.println("Maximum length of special substring : " + solution.maximumLength(s3));
        // Expected output: 1
    }

    public int maximumLength(String s) {
        int n = s.length();
        int l = 1, r = n;

        if (!helper(s, n, l)) return -1;

        while (l + 1 < r) {
            int mid = (l + r) / 2;
            if (helper(s, n, mid)) l = mid;
            else r = mid;
        }

        return l;
    }

    private boolean helper(String s, int n, int x) {
        int[] cnt = new int[26];
        int p = 0;

        for (int i = 0; i < n; i++) {
            while (s.charAt(p) != s.charAt(i)) p++;
            if (i - p + 1 >= x) cnt[s.charAt(i) - 'a']++;
            if (cnt[s.charAt(i) - 'a'] > 2) return true;
        }

        return false;
    }
}

