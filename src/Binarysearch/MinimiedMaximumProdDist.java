package Binarysearch;

public class MinimiedMaximumProdDist {
    public boolean isPossible(int maxQ, int n, int[] arr) {
        int stores = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % maxQ == 0) stores += arr[i] / maxQ;
            else stores += arr[i] / maxQ + 1;
        }
        return stores <= n;
    }

    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            mx = Math.max(mx, arr[i]);
        }
        int lo = 1, hi = mx;
        int Ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isPossible(mid, n, arr)) {
                Ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return Ans;
    }

    public static void main(String[] args) {
        MinimiedMaximumProdDist obj = new MinimiedMaximumProdDist();
        int n = 6; // Number of stores
        int[] arr = {11, 6, 7, 10, 5}; // Product distribution

        int result = obj.minimizedMaximum(n, arr);
        System.out.println("The minimized maximum quantity is: " + result);
    }
}
