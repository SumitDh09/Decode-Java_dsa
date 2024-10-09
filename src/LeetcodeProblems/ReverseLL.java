package LeetcodeProblems;

class ListNode {
    int val;
    listnode next;
    ListNode(int x) { val = x; }
}

class ReverseLL {
    public static void main(String[] args) {
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        listnode head = new listnode(1);
        head.next = new listnode(2);
        head.next.next = new listnode(3);
        head.next.next.next = new listnode(4);
        head.next.next.next.next = new listnode(5);

        // Printing the original list
        System.out.print("Original List: ");
        printList(head);

        // Reversing the list
        ReverseLL solution = new ReverseLL();
        listnode reversedHead = solution.reverseList(head);

        // Printing the reversed list
        System.out.print("Reversed List: ");
        printList(reversedHead);
    }

    // Helper method to print the list
    public static void printList(listnode head) {
        listnode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public listnode reverseList(listnode head) {
        if (head == null || head.next == null)
            return head;

        listnode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}

