package LeetcodeProblems;

import java.util.Arrays;

public class SuccessfulPairs {
    public static void main(String[] args) {
        SuccessfulPairs obj = new SuccessfulPairs();
        int[] spells1 = {5, 1, 3};
        int[] potions1 = {1, 2, 3, 4, 5};
        int success1 = 7;
        System.out.println("Pairs for spells1: " + Arrays.toString(obj.successfulPairs(spells1, potions1, success1))); // Expected output: [4, 0, 3]

        int[] spells2 = {3, 1, 2};
        int[] potions2 = {8, 5, 8};
        int success2 = 16;
        System.out.println("Pairs for spells2: " + Arrays.toString(obj.successfulPairs(spells2, potions2, success2))); // Expected output: [2, 0, 2]
    }

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];

        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int left = 0, right = m - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if ((long) spell * potions[mid] >= success) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            pairs[i] = m - left;
        }

        return pairs;
    }
}

