package LeetcodeProblems.ModuleLeetcode;

public class CapacityShipPacM2 {

    public static void main(String[] args) {
        // Example usage for testing
        int[] packageWeights = { 10, 20, 30, 40, 50 }; // Your array of package weights
        int days = 3; // Number of days for shipping
        LeetcodeProblems.ModuleLeetcode.CapacityShipPacM2 solver = new LeetcodeProblems.ModuleLeetcode.CapacityShipPacM2();
        int result = solver.shipWithinDays(packageWeights, days);
        System.out.println("Minimum capacity needed: " + result);
    }

    public boolean isPossible(int c, int[] arr, int d) {
        int n = arr.length;
        int load = 0;
        int days = 1;
        for (int i = 0; i < n; i++) {
            if (load + arr[i] <= c)
                load += arr[i];
            else {
                load = arr[i];
                days++;
            }
        }
        return days <= d;
    }

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
        int minC = sum; // Initialize minC (minimum capacity)
        while (lo <= hi) { // Binary search: TC = O(n*log(sum-mx))
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
}
