package LeetcodeProblems.GFG;

import java.util.*;

public class PrimeSubtractionOperationII {
    public static void main(String[] args) {
        PrimeSubtractionOperationII obj = new PrimeSubtractionOperationII();
        int[] nums1 = {4, 9, 6, 10};
        System.out.println("Can make nums1 strictly increasing: " + obj.primeSubOperation(nums1)); // Expected output: true

        int[] nums2 = {6, 8, 11, 12};
        System.out.println("Can make nums2 strictly increasing: " + obj.primeSubOperation(nums2)); // Expected output: true

        int[] nums3 = {5, 8, 3};
        System.out.println("Can make nums3 strictly increasing: " + obj.primeSubOperation(nums3)); // Expected output: false
    }

    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        int[] primes = generatePrimes(); // Generate primes up to 1000

        for (int i = n - 1; i > 0; i--) {
            if (nums[i] <= nums[i - 1]) {
                boolean found = false;
                for (int p : primes) {
                    if (p < nums[i] && nums[i] - p > nums[i - 1]) {
                        nums[i] -= p;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return false;
                }
            }
        }
        return true;
    }

    private int[] generatePrimes() {
        boolean[] isPrime = new boolean[1000 + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= 1000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i <= 1000; i++) {
            if (isPrime[i]) {
                primeList.add(i);
            }
        }
        return primeList.stream().mapToInt(Integer::intValue).toArray();
    }
}
