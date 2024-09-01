package BasicSortingAlgorithms;

public class HBubbleSort {
static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    }
                }
            }
        }
     public static void main(String[] args) {
         int[] arr = {3,1,4,5,2};
         System.out.println("Array Before Bubble Sort:");
         for (int i : arr) {
             System.out.print(i + " ");
         }
         System.out.println();

         bubbleSort(arr);

         System.out.println("Array After Bubble Sort:");
         for (int i : arr) {
             System.out.print(i + " ");
         }
     }
}
