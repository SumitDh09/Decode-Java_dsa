package Binarysearch;

public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {10, 23, 46, 46, 91, 97, 97, 140, 264};
        int n = arr.length;
        int target = 46;
        int ub = n;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                ub = Math.min(ub, mid);
                hi = mid - 1;
            } else lo = mid + 1;
        }
        System.out.println(ub);
    }
}

