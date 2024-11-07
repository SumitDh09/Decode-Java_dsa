package LeetcodeProblems;

import java.util.Stack;
import java.util.Arrays;

public class NumberOfVisiblePeopleInAQueue {
    public static void main(String[] args) {
        NumberOfVisiblePeopleInAQueue obj = new NumberOfVisiblePeopleInAQueue();
        int[] heights1 = {10, 6, 8, 5, 11, 9};
        int[] heights2 = {5, 1, 2, 3, 10};

        System.out.println("Visible people for heights1: " + Arrays.toString(obj.canSeePersonsCount(heights1))); // Expected output: [3, 1, 2, 1, 1, 0]
        System.out.println("Visible people for heights2: " + Arrays.toString(obj.canSeePersonsCount(heights2))); // Expected output: [4, 1, 1, 1, 0]
    }

    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] <= heights[i]) {
                res[st.peek()]++;
                st.pop();
            }
            if (!st.isEmpty()) {
                res[st.peek()]++;
            }
            st.push(i);
        }
        return res;
    }
}

