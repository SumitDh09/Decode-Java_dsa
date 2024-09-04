package Binarysearch;

import java.util.*;

class kthClosestElement {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;

        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }

        if (x >= arr[n - 1]) {
            for (int i = n - k; i < n; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }

        int lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int i = hi, j = lo;
        while (k > 0) {
            if (i < 0) {
                ans.add(arr[j++]);
            } else if (j >= n) {
                ans.add(arr[i--]);
            } else if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                ans.add(arr[i--]);
            } else {
                ans.add(arr[j++]);
            }
            k--;
        }

        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        kthClosestElement solution = new kthClosestElement();
        int[] arr = {1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> result = solution.findClosestElements(arr, k, x);
        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}

