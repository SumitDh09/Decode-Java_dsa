package Queue;

import java.util.Stack;

class MyQueue {
    Stack<Integer> input;
    Stack<Integer> output;
    //Leetcode 232
    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }
    /* TC 0(1) for all operations
       SC 0(N) for 2 stacks
    */

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        System.out.println("Peek: " + obj.peek()); // Expected output: 1
        System.out.println("Pop: " + obj.pop());   // Expected output: 1
        System.out.println("Empty: " + obj.empty()); // Expected output: false
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        peek();
        return output.pop();
    }

    public int peek() {
        if (output.empty()) {
            while (!input.empty()) {
                output.push(input.pop());
            }
        }
        return output.peek();
    }

    public boolean empty() {
        return input.empty() && output.empty();
    }

}

