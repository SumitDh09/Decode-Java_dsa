package Queue;

public class CircularQueueUsingArray {
    public static void main(String[] args) {
        CQA queue = new CQA();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println("Queue elements:");
        queue.display();

        System.out.println("Peek element: " + queue.peek());

        queue.remove();
        System.out.println("Queue elements after removing one element:");
        queue.display();

        queue.add(60);
        System.out.println("Queue elements after adding one element:");
        queue.display();

        while (!queue.isEmpty()) {
            System.out.println("Removed element: " + queue.remove());
        }

        System.out.println("Queue elements after removing all elements:");
        queue.display();
    }

    public static class CQA {
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("Array is full");
                return;
            }
            if (size == 0) {
                front = rear = 0;
                arr[0] = val;
            } else if (rear < arr.length - 1) {
                arr[++rear] = val;
            } else if (rear == arr.length - 1) {
                rear = 0;
                arr[rear] = val;
            }
            size++;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                int val = arr[front];
                if (front == arr.length - 1) {
                    front = 0;
                } else {
                    front++;
                }
                size--;
                return val;
            }
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            } else {
                return arr[front];
            }
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                for (int i = front; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                for (int i = 0; i <= rear; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }
}
