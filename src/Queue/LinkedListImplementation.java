package Queue;

public class LinkedListImplementation {
    public static void main(String[] args) {
        QueueLL que = new QueueLL();
        System.out.println("Queue is empty: " + que.isEmpty());
        que.add(1);
        que.add(2);
        que.add(3);
        que.add(4);
        que.add(5);
        que.display();
        que.size();

        System.out.println("Peek: " + que.peek());
        System.out.println("Size : " + que.size());
        System.out.println("Removed: " + que.remove());
        que.display();

        System.out.println("Queue is empty: " + que.isEmpty());
    }

    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class QueueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        public int size(){
            return size;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

/*
advantages of ll imp
1. queue is just like a ll
2. overflow condition absent

disadvantages
1. Node
int data;
Node next ;
take more space of memory than an array
 */