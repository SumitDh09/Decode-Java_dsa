package LeetcodeProblems;

class LEINode {
    int val;
    LEINode next;

    LEINode(int val) {
        this.val = val;
    }
}

class RemoveNth {
    public static void main(String[] args) {
        RemoveNth obj = new RemoveNth();
        LEINode head = new LEINode(1);
        head.next = new LEINode(2);
        head.next.next = new LEINode(3);
        head.next.next.next = new LEINode(4);
        head.next.next.next.next = new LEINode(5);

        int n = 2;
        LEINode newHead = obj.removeNthFromEnd(head, n);
        System.out.print("Updated list: ");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

    public LEINode removeNthFromEnd(LEINode head, int n) {
        LEINode slow = head;
        LEINode fast = head;
        while (n-- > 0)
            fast = fast.next;
        if (fast == null)
            return head.next;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
