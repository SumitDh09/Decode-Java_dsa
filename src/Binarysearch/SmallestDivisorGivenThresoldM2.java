package Binarysearch;

//This code is runnable but its take too much time and time limit exceeded.
class SmallestdivisorGivenThresholdM2 {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length; // Corrected variable name from 'arr' to 'nums'
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) { // Changed the starting index to 0
            mx = Math.max(mx, nums[i]);
        }
        int d;
        for (d = 1; d < mx; d++) { // Removed the redeclaration of 'd'
            int sum = 0;
            for (int i = 0; i < n; i++) { // Changed the starting index to 0
                if (nums[i] % d == 0) {
                    sum += nums[i] / d;
                } else {
                    sum += nums[i] / d + 1;
                }
            }
            if (sum <= threshold) {
                return d;
            }
        }
        return d;
    }

    public static void main(String[] args) {
        // Example usage for testing
        int[] nums = { 10, 20, 30, 40, 50 }; // Your array of integers
        int threshold = 5; // Your threshold value
        SmallestdivisorGivenThresholdM2 solver = new SmallestdivisorGivenThresholdM2();
        int result = solver.smallestDivisor(nums, threshold);
        System.out.println("Smallest divisor: " + result);
    }
}
