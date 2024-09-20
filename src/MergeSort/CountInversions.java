package MergeSort;

public class CountInversions {
    static int count;

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void inversion(int[] a, int[] b) {
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                count += (a.length - i);
                j++;
            } else {
                i++;
            }
        }
    }

    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
    }

    public static void mergesort(int[] arr) {
        int n = arr.length;
        if (n < 2) return;

        int mid = n / 2;
        int[] a = new int[mid];
        int[] b = new int[n - mid];

        System.arraycopy(arr, 0, a, 0, mid);
        System.arraycopy(arr, mid, b, 0, n - mid);

        mergesort(a);
        mergesort(b);
        inversion(a, b);
        merge(a, b, arr);
    }

    public static void main(String[] args) {
        int[] arr = {109, 33, 89, 27, 60, 10, 70};
        print(arr);
        count = 0;  // Initialize count before sorting
        mergesort(arr);
        print(arr);
        System.out.println(count);
    }
}
