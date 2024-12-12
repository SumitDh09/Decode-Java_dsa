package DynamicProgramming;


public class Tribonacci {
    public static void main(String[] args) {
        Tribonacci solution = new Tribonacci();

        int n1 = 4;
        System.out.println("T(" + n1 + ") = " + solution.tribonacci(n1)); // Expected output: 4

        int n2 = 25;
        System.out.println("T(" + n2 + ") = " + solution.tribonacci(n2)); // Expected output: 1389537
    }

    public int tribonacci(int n) {
        int x = 0;
        int y = 1;
        int z = 1;
        int ans = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 2 || n == 1) {
            return 1;
        }
        for (int i = 3; i <= n; i++) {
            ans = x + y + z;
            x = y;
            y = z;
            z = ans;
        }
        return ans;
    }
}
