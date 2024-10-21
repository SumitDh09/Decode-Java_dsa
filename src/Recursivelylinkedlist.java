class none {
    int val;
    none next;

    none(int x) { val = x; }
}

public class Recursivelylinkedlist {
    public static void print(none head) {
        none temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void displayRecursive(none head) {
        if (head == null) return;
        System.out.println(head.val);
        displayRecursive(head.next);
    }

    public static void main(String[] args) {
        none a = new none(20);
        none b = new none(10);
        none c = new none(30);
        none d = new none(40);
        none e = new none(50);
        none f = new none(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Print the linked list iteratively
        print(a);

        // Print the linked list recursively
        displayRecursive(a);
    }
}
//void display(Node head){
//    if(head==null)
//return;
//display(head.next);
//sout(head.val + " );
//}
//1. print all the elements of the linked list
//2.print all the elements except last one.
//        3. print alternate nodes of linked list
//        4.print all the noed in reverse order