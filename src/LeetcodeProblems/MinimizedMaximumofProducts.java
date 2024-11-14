package LeetcodeProblems;

public class MinimizedMaximumofProducts {
    public static void main(String[] args) {
        MinimizedMaximumofProducts obj = new MinimizedMaximumofProducts();
        int[] arr1 = {11, 6};
        int n1 = 6;
        System.out.println("Minimized maximum for arr 1: " + obj.minimizedMaximum(n1, arr1)); // Expected output: 3

        int[] arr2 = {15, 10, 10};
        int n2 = 7;
        System.out.println("Minimized maximum for arr 2: " + obj.minimizedMaximum(n2, arr2)); // Expected output: 5

        int[] arr3 = {100, 200, 300};
        int n3 = 10;
        System.out.println("Minimized maximum for arr 3: " + obj.minimizedMaximum(n3, arr3)); // Expected output: 100
    }

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
}

