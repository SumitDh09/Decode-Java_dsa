package LeetcodeProblems.LeetcodeP2;

public class MaximumScoreAfterSplittingaString {
    public static void main(String[] args) {
        MaximumScoreAfterSplittingaString solution = new MaximumScoreAfterSplittingaString();
        String s = "011101";
        System.out.println("Maximum score after splitting the string: " + solution.maxScore(s));

        String s2 = "00111";
        System.out.println("Maximum score after splitting the string: " + solution.maxScore(s2));
    }

    public int maxScore(String s) {
        int maxScore = 0;
        int zeros = 0;
        int ones = 0;

        // Count the number of ones in the entire string
        for (char c : s.toCharArray()) {
            if (c == '1') {
                ones++;
            }
        }

        // Iterate through the string and calculate the score for each split
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones--;
            }
            maxScore = Math.max(maxScore, zeros + ones);
        }

        return maxScore;
    }
}

