package MergeSort.QuickSort;

public class QuickSelectAlgorithm {
    //kth smallest element
    static int ans;
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

    public static void quickSelect(int[] arr, int lo, int hi,int k) {
        if (lo >= hi)
            return;
        if (lo==hi){
            if (lo==k-1) ans =arr[lo];

        }
        int idx = partition(arr, lo, hi);
        if (idx==k-1){
            ans =arr[idx];
            return;
        }
        if (k-1<idx) quickSelect(arr, lo, idx - 1,k);
        else quickSelect(arr, idx + 1,hi, k);
    }


    public static void main(String[] args) {
        int[] arr = {4, 9, 1,2, 6, 5, 8};
        int n = arr.length;
        print(arr);
        int k=4;
        ans=-1;
        quickSelect(arr, 0, n - 1,k);
//        print(arr);
        System.out.println(ans);
    }
}
