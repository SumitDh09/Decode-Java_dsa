package LeetcodeProblems;

public class ShiftDistance {
    public static void main(String[] args) {
        ShiftDistance solution = new ShiftDistance();
        String s1 = "abab";
        String t1 = "baba";
        int[] nextCost1 = {100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] previousCost1 = {1, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Shift distance: " + solution.shiftDistance(s1, t1, nextCost1, previousCost1)); // Expected output: 2

        String s2 = "leet";
        String t2 = "code";
        int[] nextCost2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] previousCost2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println("Shift distance: " + solution.shiftDistance(s2, t2, nextCost2, previousCost2)); // Expected output: 31
    }

    public int shiftDistance(String s, String t, int[] nextCost, int[] previousCost) {
        int totalCost = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                int sIndex = s.charAt(i) - 'a';
                int tIndex = t.charAt(i) - 'a';

                int forwardCost = 0;
                int backwardCost = 0;

                // Calculate forward cost
                int current = sIndex;
                while (current != tIndex) {
                    forwardCost += nextCost[current];
                    current = (current + 1) % 26;
                }

                // Calculate backward cost
                current = sIndex;
                while (current != tIndex) {
                    backwardCost += previousCost[current];
                    current = (current - 1 + 26) % 26;
                }

                // Choose the minimum cost
                totalCost += Math.min(forwardCost, backwardCost);
            }
        }

        return totalCost;
    }
}
