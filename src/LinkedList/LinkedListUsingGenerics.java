package LinkedList;

class Nodee<T> {
    T data;
    Nodee<T> next;

    Nodee(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListUsingGenerics<T> {
    private Nodee<T> head;
    private Nodee<T> tail;
    private int size;

    LinkedListUsingGenerics() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        LinkedListUsingGenerics<Integer> list = new LinkedListUsingGenerics<Integer>();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(50);
        list.insertAtTail(40);
        list.display(); // Show list after tail insertions
        list.insertAtTail(40);
        list.display(); // Show list after another tail insertion
        list.insertAtHead(50);
        list.display(); // Show list after head insertion
        list.insert(2, 30);
        list.display(); // Show list after insertion at index 2
        System.out.println("Size is: " + list.size());
    }

    void insertAtTail(T data) {
        Nodee<T> newNode = new Nodee<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    void insertAtHead(T data) {
        Nodee<T> newNode = new Nodee<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    void insert(int index, T data) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {
            insertAtHead(data);
            return;
        }
        if (index == size) {
            insertAtTail(data);
            return;
        }
        Nodee<T> newNode = new Nodee<>(data);
        Nodee<T> prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        newNode.next = prev.next;
        prev.next = newNode;
        size++;
    }

    void display() {
        Nodee<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    int size() {
        return size;
    }
}
