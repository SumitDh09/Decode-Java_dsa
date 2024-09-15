package BasicSortingAlgorithms;

public class DecreasingOrderinBubbleSort {
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) { // Change > to < for descending order
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then break
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSortDescending(arr);
        System.out.println("Sorted array in decreasing order:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}