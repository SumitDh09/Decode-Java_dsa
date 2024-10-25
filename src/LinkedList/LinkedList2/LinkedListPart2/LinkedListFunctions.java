package LinkedList.LinkedList2.LinkedListPart2;

class Node {
    int val;
    Node next;

    Node(int x) { val = x; }
}

public class LinkedListFunctions {

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // 1. Print all the elements of the linked list
        System.out.println("All elements:");
        print(a);

        // 2. Print all the elements except the last one
        System.out.println("All elements except last one:");
        printExceptLast(a);

        // 3. Print alternate nodes of linked list
        System.out.println("Alternate nodes:");
        printAlternate(a);

        // 4. Print all the nodes in reverse order
        System.out.println("Reverse order:");
        printReverse(a);
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printExceptLast(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printAlternate(Node head) {
        Node temp = head;
        boolean print = true;
        while (temp != null) {
            if (print) {
                System.out.print(temp.val + " ");
            }
            print = !print;
            temp = temp.next;
        }
        System.out.println();
    }

    public static void printReverse(Node head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.print(head.val + " ");
    }
}
