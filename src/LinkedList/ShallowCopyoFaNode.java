package LinkedList;

class nums {
    int val;
    nums next;

    nums(int x) { val = x; }
}

public class ShallowCopyoFaNode {

    public static void print(nums head) {
        nums temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        nums a = new nums(10);
        System.out.println(a.val);
        nums temp = a; // shallow copy
        // nums temp = new nums(100); // deep copy
        // System.out.println(a);
        // System.out.println(temp);
        // temp.val = 12;
        // System.out.println(a.val);

        nums b = new nums(20);
        nums c = new nums(30);
        nums d = new nums(40);
        nums e = new nums(50);
        nums f = new nums(60);
        // System.out.println(e.val);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        print(a);
        //     temp = a;
//        while (temp != null) {
//            System.out.println(temp.val);
//            temp = temp.next;
    }
}
