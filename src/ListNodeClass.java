class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}//class Car{//    String name;//    int price;////    Car(String name, int price) {//        this.name = name;//        this.price = price;//    }//}
public class ListNodeClass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);//        Node f = new Node(60);////
        // System.out.println(e.val);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.val);
        System.out.println(b.val);
        System.out.println(c.val);
        System.out.println(d.val);
        System.out.println(e.val);
        System.out.println(a.next.val);
        System.out.println(a.next.next.val);
        System.out.println(a.next.next.next.val);
        System.out.println(a.next.next.next.next.val);
    }
}

                            