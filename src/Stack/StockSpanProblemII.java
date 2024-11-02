package Stack;
import java.util.Stack;

public class StockSpanProblemII {
    public static void main(String[] args) {
        int[] price = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int[] span = calculateSpan(price, n);

        printArray(span);
    }

    static int[] calculateSpan(int[] price, int n) {
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop();
            }
            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
