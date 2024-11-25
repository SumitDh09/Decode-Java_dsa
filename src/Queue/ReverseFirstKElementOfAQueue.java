package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseFirstKElementOfAQueue {
    public static void main(String[] args) {
        ReverseFirstKElementOfAQueue reverseFirstKElementOfAQueue = new ReverseFirstKElementOfAQueue();
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);

        Queue<Integer> newQ = reverseFirstKElementOfAQueue.modifyQueue(que, 3);
        System.out.println(newQ);
    }

    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // Use an auxiliary stack
        Stack<Integer> st = new Stack<>();
        int n = q.size() - k;

        // Pop the first k elements from the queue and push them onto the stack
        while (k-- > 0) {
            int a = q.peek();
            q.poll();
            st.push(a);
        }

        // While the stack is not empty, push the elements back into the queue
        while (!st.isEmpty()) {
            int a = st.peek();
            st.pop();
            q.add(a);
        }

        // Move the rest of the elements to the back of the queue
        for (int i = 0; i < n; i++) {
            int a = q.peek();
            q.poll();
            q.add(a);
        }

        return q; // Add this line to return the modified queue
    }
}
