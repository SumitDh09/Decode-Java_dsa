package LeetcodeProblems;

import java.util.Stack;

public class StockSpanner {
    private Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(100));  // Expected output: 1
        System.out.println(stockSpanner.next(80));   // Expected output: 1
        System.out.println(stockSpanner.next(60));   // Expected output: 1
        System.out.println(stockSpanner.next(70));   // Expected output: 2
        System.out.println(stockSpanner.next(60));   // Expected output: 1
        System.out.println(stockSpanner.next(75));   // Expected output: 4
        System.out.println(stockSpanner.next(85));   // Expected output: 6
    }

    public int next(int price) {
        int span = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }
}
