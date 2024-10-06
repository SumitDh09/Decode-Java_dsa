package LeetcodeProblems;

/**
 * Definition for singly-linked list.
 */
class ListNodes {
    int val;
    ListNode next;
    ListNodes() {}
    ListNodes(int val) { this.val = val; }
    ListNodes(int val, ListNode next) { this.val = val; this.next = next; }
}

public class OddEvenLinkedList {
    // Helper method to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        int[] arr = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(arr);

        System.out.println("Original Linked List:");
        printLinkedList(head);

        // Create an instance of OddEvenLinkedList
        OddEvenLinkedList solution = new OddEvenLinkedList();

        // Apply odd-even grouping
        ListNode result = solution.oddEvenList(head);

        System.out.println("Linked List after odd-even grouping:");
        printLinkedList(result);
    }

    public ListNode oddEvenList(ListNode head) {
        // Handle edge cases
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            // Connect odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Connect even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Connect the end of odd list to the start of even list
        odd.next = evenHead;

        return head;
    }
}