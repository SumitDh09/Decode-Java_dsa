package LinkedList;

public class LinkedListForDeletenode {

    Node<Integer> head;
    int size;

    LinkedListForDeletenode() {
        this.head = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        LinkedListForDeletenode obj = new LinkedListForDeletenode();
        obj.insertTail(10);
        obj.printList();
        obj.insertTail(20);
        obj.printList();
        obj.insertTail(40);
        obj.printList();
        obj.insertNode(50, 4);
        obj.insertNode(40, 4);
        obj.printList();
        obj.insertNode(30, 3);
        obj.printList();
        obj.deleteTail();
        obj.printList();
        obj.deleteNode(3);
        obj.printList();
        obj.deleteNode(1);
        obj.printList();
    }

    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node<Integer> temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Size: " + size);
    }

    public void insertNode(int data, int position) {
        if (position > size + 1 || position <= 0) {
            System.out.println("Invalid position. Current size: " + size);
            return;
        }
        if (position == 1) {
            insertHead(data);
        } else if (position == size + 1) {
            insertTail(data);
        } else {
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
            System.out.println("Inserted " + data + " at position " + position);
        }
    }

    public void insertHead(int data) {
        Node<Integer> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("Inserted " + data + " at head");
    }

    public void insertTail(int data) {
        if (head == null) {
            insertHead(data);
            return;
        }
        Node<Integer> newNode = new Node<>(data);
        Node<Integer> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
        System.out.println("Inserted " + data + " at tail");
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        int deletedData = head.data;
        head = head.next;
        size--;
        System.out.println("Deleted " + deletedData + " from head");
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            deleteHead();
            return;
        }
        Node<Integer> temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        int deletedData = temp.next.data;
        temp.next = null;
        size--;
        System.out.println("Deleted " + deletedData + " from tail");
    }

    public void deleteNode(int position) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (position > size || position <= 0) {
            System.out.println("Invalid position. Current size: " + size);
            return;
        }
        if (position == 1) {
            deleteHead();
        } else if (position == size) {
            deleteTail();
        } else {
            Node<Integer> temp = head;
            for (int i = 1; i < position - 1; i++) {
                temp = temp.next;
            }
            int deletedData = temp.next.data;
            temp.next = temp.next.next;
            size--;
            System.out.println("Deleted " + deletedData + " from position " + position);
        }
    }

    static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}