package LeetcodeProblems;

//Slow and fast method
class LNode {
    int val;
    LNode next;

    LNode(int val) {
        this.val = val;
    }
}

class MiddleOfTheLinkedListII {
    public static void main(String[] args) {
        MiddleOfTheLinkedListII obj = new MiddleOfTheLinkedListII();
        LNode head = new LNode(1);
        head.next = new LNode(2);
        head.next.next = new LNode(3);
        head.next.next.next = new LNode(4);
        head.next.next.next.next = new LNode(5);

        LNode middle = obj.middleNode(head);
        System.out.println("Middle node value: " + middle.val); // Expected output: 3
    }

    public LNode middleNode(LNode head) {
        LNode slow = head;
        LNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
