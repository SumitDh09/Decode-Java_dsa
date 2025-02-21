package GeekForGeeks160Que;
import java.util.Arrays;

public class BeautifulSubsequences {
    static final int MOD = 1000000007;

    // Function to check if a number is beautiful
    static boolean isBeautiful(int num) {
        if (num == 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                if (!isPrime(i) || (num / i != i && !isPrime(num / i))) {
                    return false;
                }
            }
        }
        return true;
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to count the number of beautiful subsequences
    static int countBeautifulSubsequences(int[] arr) {
        int n = arr.length;
        int count = 0;

        // Iterate over all subsequences
        for (int i = 1; i < (1 << n); i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    product *= arr[j];
                }
            }
            if (isBeautiful(product)) {
                count = (count + 1) % MOD;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5};  // Example array
        System.out.println("Number of beautiful subsequences: " + countBeautifulSubsequences(arr));
    }
}
