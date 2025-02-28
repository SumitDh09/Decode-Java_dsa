package LeetcodeProblems;

class ShortestCommonSuperSeq {
    public static void main(String[] args) {
        ShortestCommonSuperSeq scs = new ShortestCommonSuperSeq();
        String str1 = "abac";
        String str2 = "cab";
        String result = scs.shortestCommonSupersequence(str1, str2);
        System.out.println("The shortest common supersequence is: " + result);
    }

    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] dp = new int[m + 1][n + 1];

        // Compute length of longest common subsequence (LCS)
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Reconstruct the shortest common supersequence from the LCS dp table
        StringBuilder result = new StringBuilder();
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                result.append(str1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                result.append(str1.charAt(i - 1));
                i--;
            } else {
                result.append(str2.charAt(j - 1));
                j--;
            }
        }

        while (i > 0) {
            result.append(str1.charAt(i - 1));
            i--;
        }
        while (j > 0) {
            result.append(str2.charAt(j - 1));
            j--;
        }

        return result.reverse().toString();
    }
}
