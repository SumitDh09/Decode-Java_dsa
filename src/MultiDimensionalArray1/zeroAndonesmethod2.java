package MultiDimensionalArray1;

public class zeroAndonesmethod2 {


        public static void main(String[] args) {
            int[] arr = new int[]{1, 0, 0, 1, 1};
            int n = arr.length;
            int i = 0;
            int j = n - 1;

            while (i < j) {
                // Move the left pointer forward if it points to a 0
                if (arr[i] == 0) {
                    ++i;
                }
                // Move the right pointer backward if it points to a 1
                if (arr[j] == 1) {
                    --j;
                }
                // Swap the elements if left pointer is at 1 and right pointer is at 0
                if (arr[i] == 1 && arr[j] == 0) {
                    // Swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    ++i;
                    --j;
                }
            }

            // Print the sorted array
            for (int ele : arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }