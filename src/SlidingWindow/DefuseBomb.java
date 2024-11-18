package SlidingWindow;

import java.util.Arrays;

public class DefuseBomb {
    public static void main(String[] args) {
        DefuseBomb obj = new DefuseBomb();
        int[] code1 = {5, 7, 1, 4};
        int k1 = 3;
        System.out.println("Decrypted code for code1: " + Arrays.toString(obj.decrypt(code1, k1))); // Expected output: [12, 10, 16, 13]

        int[] code2 = {1, 2, 3, 4};
        int k2 = 0;
        System.out.println("Decrypted code for code2: " + Arrays.toString(obj.decrypt(code2, k2))); // Expected output: [0, 0, 0, 0]

        int[] code3 = {2, 4, 9, 3};
        int k3 = -2;
        System.out.println("Decrypted code for code3: " + Arrays.toString(obj.decrypt(code3, k3))); // Expected output: [12, 5, 6, 13]
    }

    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result; // All elements should be replaced with 0
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
            } else {
                for (int j = 1; j <= -k; j++) {
                    sum += code[(i - j + n) % n];
                }
            }
            result[i] = sum;
        }

        return result;
    }
}

