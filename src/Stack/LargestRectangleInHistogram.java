package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        LargestRectangleInHistogram obj = new LargestRectangleInHistogram();
        int[] hist = {6, 2, 5, 4, 5, 1, 6};
        int result = obj.largestRectangleArea(hist);
        System.out.println("Largest rectangular area: " + result); // Expected output: 12
    }

    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;

        while (i < n) {
            if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
                stack.push(i++);
            } else {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
        }

        while (!stack.isEmpty()) {
            int height = heights[stack.pop()];
            int width = stack.isEmpty() ? i : i - stack.peek() - 1;
            maxArea = Math.max(maxArea, height * width);
        }

        return maxArea;
    }
}

