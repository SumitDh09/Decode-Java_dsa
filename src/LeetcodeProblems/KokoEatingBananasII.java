package LeetcodeProblems;

import java.util.Arrays;

public class KokoEatingBananasII {
    public static void main(String[] args) {
        KokoEatingBananasII obj = new KokoEatingBananasII();
        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println("Minimum eating speed for piles1: " + obj.minEatingSpeed(piles1, h1)); // Expected output: 4

        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println("Minimum eating speed for piles2: " + obj.minEatingSpeed(piles2, h2)); // Expected output: 30

        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println("Minimum eating speed for piles3: " + obj.minEatingSpeed(piles3, h3)); // Expected output: 23
    }

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();

        while (l < r) {
            final int m = (l + r) / 2;
            if (eatHours(piles, m) <= h)
                r = m;
            else
                l = m + 1;
        }

        return l;
    }

    // Returns the hours to eat all the piles with speed m.
    private int eatHours(int[] piles, int m) {
        return Arrays.stream(piles).reduce(
                0, (subtotal, pile) -> subtotal + (pile - 1) / m + 1); // ceil(pile / m)
    }
}
