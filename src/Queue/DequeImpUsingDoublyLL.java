package Queue;

public class DequeImpUsingDoublyLL {
    public static void main(String[] args) {
        Deque deque = new Deque();
        deque.insertFront(10);
        deque.insertRear(20);
        deque.insertFront(5);
        deque.insertRear(25);
        deque.display();
        // Expected output: 5 10 20 25

        System.out.println("Front element: " + deque.getFront());
        // Expected output: 5
        System.out.println("Rear element: " + deque.getRear());
        // Expected output: 25

        deque.deleteFront();
        deque.deleteRear();
        deque.display();
        // Expected output: 10 20

        System.out.println("Deque size: " + deque.size());
        // Expected output: 2
    }

    static class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    static class Deque {
        Node front;
        Node rear;
        int size;

        Deque() {
            front = rear = null;
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }

        int size() {
            return size;
        }

        void insertFront(int data) {
            Node newNode = new Node(data);
            if (front == null) {
                // deque is empty
                rear = front = newNode;
            } else {
                newNode.next = front;
                front.prev = newNode;
                front = newNode;
            }
            size++;
        }

        void insertRear(int data) {
            Node newNode = new Node(data);
            if (rear == null) {
                // deque is empty
                front = rear = newNode;
            } else {
                newNode.prev = rear;
                rear.next = newNode;
                rear = newNode;
            }
            size++;
        }

        void deleteFront() {
            // check underflow condition
            if (size == 0) {
                System.out.println("Underflow");
                return;
            } else {
                Node temp = front;
                front = front.next;
                if (front == null) {
                    rear = null;
                } else {
                    front.prev = null;
                }
                size--;
            }
        }

        void deleteRear() {
            if (size == 0) {
                System.out.println("Queue is empty, underflow");
                return;
            } else {
                Node temp = rear;
                rear = rear.prev;
                if (rear == null) {
                    front = null;
                } else {
                    rear.next = null;
                }
                size--;
            }
        }

        int getFront() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return front.data;
        }

        int getRear() {
            if (isEmpty()) {
                System.out.println("Deque is empty");
                return -1;
            }
            return rear.data;
        }

        void display() {
            Node temp = front;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}