package LeetcodeProblems;

class MinimumFlopToMakeaOR {
    public static void main(String[] args) {
        MinimumFlopToMakeaOR obj = new MinimumFlopToMakeaOR();
        int a = 2; // Binary: 10
        int b = 6; // Binary: 110
        int c = 5; // Binary: 101
        int result = obj.minFlips(a, b, c);
        System.out.println("Minimum flips required: " + result); // Expected output: 3
    }

    public int minFlips(int a, int b, int c) {
        final int kMaxBit = 30;
        int ans = 0;
        for (int i = 0; i < kMaxBit; ++i) {
            if ((c >> i & 1) == 1) {
                ans += ((a >> i & 1) == 0 && (b >> i & 1) == 0) ? 1 : 0;
            } else { // (c >> i & 1) == 0
                ans += ((a >> i & 1) == 1 ? 1 : 0) + ((b >> i & 1) == 1 ? 1 : 0);
            }
        }
        return ans;
    }
}
