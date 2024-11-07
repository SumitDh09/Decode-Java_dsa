package LeetcodeProblems;

public class LargestCombination {
    public static void main(String[] args) {
        LargestCombination obj = new LargestCombination();
        int[] candidates1 = {16, 17, 71, 62, 12, 24, 14};
        int[] candidates2 = {8, 8};

        System.out.println("Largest combination size for candidates1: " + obj.largestCombination(candidates1)); // Expected output: 4
        System.out.println("Largest combination size for candidates2: " + obj.largestCombination(candidates2)); // Expected output: 2
    }

    public int largestCombination(int[] candidates) {
        int maxCount = 0;
        for (int bit = 0; bit < 24; bit++) {
            int count = 0;
            for (int candidate : candidates) {
                if ((candidate & (1 << bit)) != 0) {
                    count++;
                }
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}

