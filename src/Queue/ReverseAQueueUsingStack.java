package Queue;

import java.util.*;


public class ReverseAQueueUsingStack {
    static Queue<Integer> queue;

    static void print(){
        for (Integer num : queue) {
            System.out.print(num + " ");
        }
        System.out.println();
    }


    static void reversequeue(){
        Stack<Integer> st = new Stack<>();
        while (!queue.isEmpty()){
            st.push(queue.remove());
        }
        while (!st.isEmpty()){
            queue.add(st.pop());
        }
    }
    public static void main(String[] args) {

        queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(62);
        queue.add(70);
        queue.add(80);
        queue.add(90);
        queue.add(100);
        print();
        System.out.println("reversing the queue ");
        reversequeue();
        print();

    }
}
