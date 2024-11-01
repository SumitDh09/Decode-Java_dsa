package Stack;

class StackUnderflowException extends RuntimeException {
    public StackUnderflowException(String message) {
        super(message);
    }
}

class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    public MyStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Indicates that the stack is empty
    }

    // Push method to add an element to the stack
    public void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow: Cannot push " + value + " onto the stack.");
            return;
        }
        stack[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    // Pop method to remove an element from the stack
    public int pop() {
        if (isEmpty()) {
            throw new StackUnderflowException("Underflow condition: Cannot pop from an empty stack.");
        }
        return stack[top--];
    }

    // Peek method to view the top element without removing it
    public int peek() {
        if (isEmpty()) {
            throw new StackUnderflowException("Underflow condition: Cannot peek at an empty stack.");
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to get the current size of the stack
    public int size() {
        return top + 1;
    }
}

public class StackUnderflowExample {
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        // Attempting to pop from an empty stack
        try {
            stack.pop(); // This will throw an exception
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }

        // Push some elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop an element from the stack
        System.out.println("Popped: " + stack.pop());

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop all elements
        stack.pop();
        stack.pop();

        // Attempting to pop from an empty stack again
        try {
            stack.pop(); // This will throw an exception
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        }
    }
}