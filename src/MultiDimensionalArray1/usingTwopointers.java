package MultiDimensionalArray1;

public class usingTwopointers {

        public static void main(String[] args) {
            int[] arr = new int[]{10, 20, 30, 40, 50, 60, 70, 80};

            // Print original array
            System.out.println("Original Array:");
            printArray(arr);

            // Reverse the array
            reverseArray(arr);

            // Print reversed array
            System.out.println("Reversed Array:");
            printArray(arr);
        }

        // Method to reverse the array using two-pointer approach
        public static void reverseArray(int[] arr) {
            int i = 0;
            int j = arr.length - 1;
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        // Method to swap two elements in the array
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        // Method to print the array elements
        public static void printArray(int[] arr) {
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }

}