package LinkedList.LinkedList2.LinkedListPart2;
 

class SLL {
    private Node head;
    private Node tail;
    private int size;

    void insertAtTail(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtTail(val);
            return;
        }
        Node temp = new Node(val);
        Node prev = head;
        for (int i = 0; i < idx - 1; i++) {
            prev = prev.next;
        }
        temp.next = prev.next;
        prev.next = temp;
        size++;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void size() {
        System.out.println("size is :" + size);
    }
}

public class ImplementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.size(); // Show initial size
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(50);
        list.insertAtTail(40);
        list.display(); // Show list after tail insertions
        list.insertAtTail(40);
        list.display(); // Show list after another tail insertion
        list.insertAtHead(50);
        list.display(); // Show list after head insertion
        list.insert(2, 40);
        list.display(); // Show list after insertion at index 2
        list.size(); // Show final size
    }
}
