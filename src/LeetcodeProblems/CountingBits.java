package LeetcodeProblems;

public class CountingBits {
    public static void main(String[] args) {
        CountingBits obj = new CountingBits();
        int n = 5;
        int[] result = obj.countBits(n);

        System.out.print("Number of 1's in binary representation: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 0 1 1 2 1 2
    }

    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}
