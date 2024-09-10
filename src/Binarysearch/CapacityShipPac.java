package Binarysearch;

public class CapacityShipPac {
    // Assuming you have an 'isPossible' method that checks if shipping is possible with a given capacity

    public int shipWithinDays(int[] arr, int d) {
        int n = arr.length;
        int sum = 0;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            mx = Math.max(mx, arr[i]);
            sum += arr[i]; // Calculate the total sum of weights
        }
        int lo = mx;
        int hi = sum;
        int minC = -1; // Initialize minC (minimum capacity)
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(mid, arr, d)) {
                minC = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return minC;
    }

    // Placeholder for the 'isPossible' method
    private boolean isPossible(int capacity, int[] arr, int d) {
        // Implement your logic here

        // Check if it's possible to ship all packages within 'd' days using the given capacity

        // Return true or false accordingly
        // You might need to adjust this method based on your specific requirements
        return true; // Placeholder
    }

    public static void main(String[] args) {
        // Example usage for testing
        int[] packageWeights = { 10, 20, 30, 40, 50 }; // Your array of package weights
        int days = 3; // Number of days for shipping
        CapacityShipPac solver = new CapacityShipPac();
        int result = solver.shipWithinDays(packageWeights, days);
        System.out.println("Minimum capacity needed: " + result);
    }
}
