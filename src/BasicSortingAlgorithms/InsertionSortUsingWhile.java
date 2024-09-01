package BasicSortingAlgorithms;

public class InsertionSortUsingWhile{
public static void print(int[] arr) {
    for (int ele : arr) {
        System.out.print(ele + " ");
    }
    System.out.println();
}

public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public static void main(String[] args) {
    int[] arr = {10, -4, 20, 7, 8, -6};
    int n = arr.length;
    print(arr);

    // Insertion Sort
    for (int i = 1; i < n; i++) {
        // n passes
        int j=i;
        while (j>=1 && arr[j]<arr[j-1]){
        swap(arr, j, j - 1);
         j--;
        }
    }
    print(arr);
}
}
