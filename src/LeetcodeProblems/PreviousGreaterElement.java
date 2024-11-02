package LeetcodeProblems;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void main(String[] args) {
        int[] arr = {10, 4, 5, 20, 40, 12, 30};

        int n = arr.length;
        prevGreater(arr, n);
    }

    public static void prevGreater(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        System.out.println("-1");

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && st.peek() <= arr[i])
                st.pop();

            if (st.isEmpty())
                System.out.println("-1");
            else
                System.out.println(st.peek());

            st.push(arr[i]);
        }
    }
}
