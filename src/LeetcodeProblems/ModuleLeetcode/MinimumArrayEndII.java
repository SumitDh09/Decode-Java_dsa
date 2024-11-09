package LeetcodeProblems.ModuleLeetcode;


public class MinimumArrayEndII {
    public static void main(String[] args) {
        MinimumArrayEndII obj = new MinimumArrayEndII();
        int n1 = 3, x1 = 4;
        int n2 = 2, x2 = 7;

        System.out.println("Minimum possible value of nums[n - 1] for n1, x1: " + obj.minEnd(n1, x1)); // Expected output: 6
        System.out.println("Minimum possible value of nums[n - 1] for n2, x2: " + obj.minEnd(n2, x2)); // Expected output: 15
    }

    public long minEnd(int n, int x) {
        --n;
        long ans = x;
        for (int i = 0; i < 31; ++i) {
            if ((x >> i & 1) == 0) {
                ans |= (n & 1) << i;
                n >>= 1;
            }
        }
        ans |= (long) n << 31;
        return ans;
    }
}

