package LeetcodeProblems;

class LIIstNode {
    int val;
    LIIstNode next;

    LIIstNode(int val) {
        this.val = val;
    }
}

class RemoveNthII {
    public static void main(String[] args) {
        RemoveNthII obj = new RemoveNthII();
        LIIstNode head = new LIIstNode(1);
        head.next = new LIIstNode(2);
        head.next.next = new LIIstNode(3);
        head.next.next.next = new LIIstNode(4);
        head.next.next.next.next = new LIIstNode(5);

        int n = 2;
        LIIstNode newHead = obj.removeNthFromEnd(head, n);
        System.out.print("Updated list: ");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

    public LIIstNode removeNthFromEnd(LIIstNode head, int n) {
        LIIstNode slow = head;
        LIIstNode fast = head;
        // move fast and slow
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }
        if (fast == null) {
            // n == len
            // delete the head
            return head.next;
        }
        // move slow
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
