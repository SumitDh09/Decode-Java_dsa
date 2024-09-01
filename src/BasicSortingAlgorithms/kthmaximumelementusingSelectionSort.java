package BasicSortingAlgorithms;

public class kthmaximumelementusingSelectionSort {
    // Function to perform the selection sort with placing kth maximum element in each pass
    public static void selectionSortKthMax(int[] arr, int k) {
        int n = arr.length;

        // We need at least k passes to find the kth maximum in each pass
        for (int i = 0; i < n; i++) {
            // Check if the kth maximum element is within the bounds of the current pass
            if (i + k <= n) {
                // Find the k-th maximum element in the unsorted part of the array
                int maxIndex = findKthMaximumIndex(arr, i, i + k - 1);

                // Swap the kth maximum element to its correct position
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[i];
                arr[i] = temp;
            } else {
                break;
            }
        }
    }
    // Helper function to find the index of the kth maximum element in a given range
    private static int findKthMaximumIndex(int[] arr, int start, int end) {
        int k = end - start + 1;
        int maxIndex = start;

        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test the selectionSortKthMax
    public static void main(String[] args) {
        int[] arr = {11,25,45,91,35,4};
        int k = 2; // Change k based on the requirement

        System.out.println("Original array:");
        printArray(arr);

        selectionSortKthMax(arr, k);

        System.out.println("Sorted array with kth maximum in each pass:");
        printArray(arr);
    }
}

