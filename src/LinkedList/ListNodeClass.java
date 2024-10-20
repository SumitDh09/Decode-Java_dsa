package LinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
//class Car{
//    String name;
//    int price;
//
//    Car(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//}

public class ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        System.out.println(f.val);
    }
}
