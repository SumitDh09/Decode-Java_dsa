package Stack;

public class LinkedListImplementationOfStack {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(5);
        st.push(6);
//        st.display();/ Should display 1 2 3 4 5

//        st.push(6); // Should display "Stack is full"

        System.out.println(st.peek()); // Should display 6
        System.out.println(st.size());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());

//        st.pop();
//        st.display(); // Should display 1 2 3 4
//
//        st.pop();
//        st.pop();
//        st.pop();
//        st.pop();
//        st.display(); // Should display "The stack is empty"
//
//        st.pop(); // Should display "The stack is empty" indicating underflow condition

    }

    public static class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next=null;
        }
    }

    public static class Stack {
        Node head = null;
        int size =0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        int size(){
            return size;

        }
        int pop(){
            if (head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;

        }
        int peek() {
            if (head == null) {
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            return x;
        }
        boolean isEmpty(){
            if (size ==0) return true;
            else return false;

        }
        void display(){
            displyRec(head);
        }
        void displyRec(Node h){
            if (h==null)
                return;
            displyRec(h.next);
            System.out.println(h.val);

        }


    }
}
