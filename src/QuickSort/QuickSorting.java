package QuickSort;

public class QuickSorting {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int pivotidx = lo;
        int smallercount = 0;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot)
                smallercount++;
        }
        int correctidx = pivotidx + smallercount;
        swap(arr, pivotidx, correctidx);
        int i = lo;
        int j = hi;
        while (i < correctidx && j > correctidx) {
            while (i < correctidx && arr[i] <= pivot) i++;
            while (j > correctidx && arr[j] > pivot) j--;
            if (i < correctidx && j > correctidx) {
                swap(arr, i, j);
            }
        }
        return correctidx;
    }

    public static void quicksort(int[] arr, int lo, int hi) {
        if (lo >= hi)
            return;
        int idx = partition(arr, lo, hi);
        quicksort(arr, lo, idx - 1);
        quicksort(arr, idx + 1, hi);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};
        int n = arr.length;
        print(arr);
        quicksort(arr, 0, n - 1);
        print(arr);
    }
}