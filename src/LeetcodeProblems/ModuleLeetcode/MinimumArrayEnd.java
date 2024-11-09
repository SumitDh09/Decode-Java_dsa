package LeetcodeProblems.ModuleLeetcode;


public class MinimumArrayEnd {
    public static void main(String[] args) {
        MinimumArrayEnd obj = new MinimumArrayEnd();
        int n1 = 3, x1 = 4;
        int n2 = 2, x2 = 7;

        System.out.println("Minimum possible value of nums[n - 1] for n1, x1: " + obj.minEnd(n1, x1)); // Expected output: 6
        System.out.println("Minimum possible value of nums[n - 1] for n2, x2: " + obj.minEnd(n2, x2)); // Expected output: 15
    }

    public long minEnd(int n, int x) {
        // The minimum possible value of nums[n - 1] is obtained by merging x and (n - 1)
        return (long) x | (n - 1);
    }
}

