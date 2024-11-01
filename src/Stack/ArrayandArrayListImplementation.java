package Stack;

public class ArrayandArrayListImplementation {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.display(); // Should display 1 2 3 4 5

        System.out.println("Peek: " + st.peek()); // Should display 5
        System.out.println("Size: " + st.size()); // Should display 5

        System.out.println("Pop: " + st.pop()); // Should display 5
        System.out.println("Size: " + st.size()); // Should display 4
        st.display(); // Should display 1 2 3 4

        System.out.println("Pop: " + st.pop()); // Should display 4
        System.out.println("Size: " + st.size()); // Should display 3
        st.display(); // Should display 1 2 3

        System.out.println("Pop: " + st.pop()); // Should display 3
        System.out.println("Size: " + st.size()); // Should display 2
        st.display(); // Should display 1 2

        System.out.println("Pop: " + st.pop()); // Should display 2
        System.out.println("Size: " + st.size()); // Should display 1
        st.display(); // Should display 1

        System.out.println("Pop: " + st.pop()); // Should display 1
        System.out.println("Size: " + st.size()); // Should display 0
        st.display(); // Should display nothing

        System.out.println("Pop: " + st.pop()); // Should display "The stack is empty"
        System.out.println(st.isEmpty());
    }

    public static class Stack {
        private int[] arr = new int[5];
        private int idx = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("The stack is empty");
                return -1;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("The stack is empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size() {
            return idx;
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return arr.length == idx;
        }
    }
}
