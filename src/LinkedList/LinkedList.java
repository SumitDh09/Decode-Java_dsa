package LinkedList;

public class LinkedList {

    Node<Integer> head;
    int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.insertTail(10);
        obj.printList();
        obj.insertTail(20);
        obj.printList();
        obj.insertTail(40);
        obj.printList();
        obj.insertNode(50,5);

        obj.insertNode(40,4);
        obj.printList();
        obj.insertNode(30,4);
        obj.printList();
    }

    public void printList() {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.println("data is --> " + temp.data);
            temp = temp.next;
        }
    }

    public void insertNode(int data, int position) {
        if (position > size + 1 || position <= 0) {
            System.out.println("Wrong input");
            return;
        }
        // head
        if (position == 1) {
            insertHead(data);
        } else if (position == size + 1) {
            insertTail(data);
        } else {
            int counter = 1;
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            while (counter < position - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
        System.out.println("Insertion successful at position " + position);
    }

    public void insertHead(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            System.out.println("Insertion at head is successful");
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        System.out.println("Insertion at head is successful");
        size++;
    }

    public void insertTail(int data) {
        Node<Integer> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            System.out.println("Insertion at tail is successful");
            size++;
            return;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Insertion at tail is successful");
        size++;
    }

    static class Node<T> {
        T data;
        Node<T> next;

        Node() {
            this.next = null;
        }

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}
