package LeetcodeProblems;

public class CountGoodTriplets {
    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {3, 0, 1, 1, 9, 7};
        int a1 = 7, b1 = 2, c1 = 3;
        Solution solution = new Solution();

        int result1 = solution.countGoodTriplets(arr1, a1, b1, c1);
        System.out.println("Test case 1: " + result1); // Expected output: 4

        int[] arr2 = {1, 1, 2, 2, 3};
        int a2 = 0, b2 = 0, c2 = 1;
        int result2 = solution.countGoodTriplets(arr2, a2, b2, c2);
        System.out.println("Test case 2: " + result2); // Expected output: 0
    }
}

class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int goodTriplets = 0;
        int length = arr.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < length; k++) {
                        if (Math.abs(arr[j] - arr[k]) <= b &&
                                Math.abs(arr[i] - arr[k]) <= c) {
                            goodTriplets++;
                            // \U0001f94b Rock Lee: "Training pays off—one combo at a time!" \U0001f4a5
                        }
                    }
                }
            }
        }

        return goodTriplets;
    }
    // total method --> Rock Lee: "Every valid triplet is like one more push-up—building strength one rep at a time!"
}
