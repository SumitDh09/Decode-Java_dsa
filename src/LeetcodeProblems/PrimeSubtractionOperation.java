package LeetcodeProblems;

import java.util.*;

public class PrimeSubtractionOperation {
    public static void main(String[] args) {
        PrimeSubtractionOperation obj = new PrimeSubtractionOperation();
        int[] nums1 = {4, 9, 6, 10};
        System.out.println("Can make nums1 strictly increasing: " + obj.primeSubOperation(nums1)); // Expected output: true

        int[] nums2 = {6, 8, 11, 12};
        System.out.println("Can make nums2 strictly increasing: " + obj.primeSubOperation(nums2)); // Expected output: true

        int[] nums3 = {5, 8, 3};
        System.out.println("Can make nums3 strictly increasing: " + obj.primeSubOperation(nums3)); // Expected output: false
    }

    public boolean primeSubOperation(int[] nums) {
        final int kMax = 1000;
        final List<Integer> primes = sieveEratosthenes(kMax);

        int prevNum = 0;
        for (int num : nums) {
            // Make nums[i] the smallest as possible and still > nums[i - 1].
            final int i = firstGreaterEqual(primes, num - prevNum);
            if (i > 0)
                num -= primes.get(i - 1);
            if (num <= prevNum)
                return false;
            prevNum = num;
        }

        return true;
    }

    private List<Integer> sieveEratosthenes(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i < n; ++i)
            if (isPrime[i])
                for (int j = i * i; j < n; j += i)
                    isPrime[j] = false;
        for (int i = 2; i < n; ++i)
            if (isPrime[i])
                primes.add(i);
        return primes;
    }

    private int firstGreaterEqual(List<Integer> A, int target) {
        final int i = Collections.binarySearch(A, target);
        return i < 0 ? -i - 1 : i;
    }
}
