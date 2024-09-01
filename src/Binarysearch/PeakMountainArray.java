package Binarysearch;

public class PeakMountainArray {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 1;
        int hi = n - 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return 57429; // This line should never be reached if the input is a valid mountain array
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 7, 5, 3, 1};
        System.out.println("Peak index: " + peakIndexInMountainArray(arr));
    }
}
