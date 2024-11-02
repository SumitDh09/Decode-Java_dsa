package LeetcodeProblems.GFG;

import java.util.Stack;

class nextLargestElement {
    // Function to find the next greater element for each element of the array.
    public static long[] nextLargestElement(long[] arr, int n) {
        long[] output = new long[n];
        output[n - 1] = -1;

        Stack<Long> st = new Stack<>();
        st.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();

            output[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return output;
    }

    public static void main(String[] args) {
        long[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;
        long[] result = nextLargestElement(arr, n);

        System.out.print("Next greater elements: ");
        for (long num : result) {
            System.out.print(num + " ");
        }
        // Expected output: 5 10 10 -1 -1
    }
}
