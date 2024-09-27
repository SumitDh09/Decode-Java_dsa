package LeetcodeProblems;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class ReverseLL {
    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Printing the original list
        System.out.print("Original List: ");
        printList(head);

        // Reversing the list
        ReverseLL solution = new ReverseLL();
        ListNode reversedHead = solution.reverseList(head);

        // Printing the reversed list
        System.out.print("Reversed List: ");
        printList(reversedHead);
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

