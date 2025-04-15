package LeetcodeProblems.LeetcodeP2;

// Definition for a singly linked list node
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class RotateList {
    // Utility method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original list:");
        printList(head);

        // Rotating the list by 2 positions
        Solution solution = new Solution();
        head = solution.rotateRight(head, 2);

        System.out.println("Rotated list:");
        printList(head);
    }
}

// Solution class that rotates the linked list
class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null || n == 0) return head;

        // Find the length of the list
        ListNode temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }

        // Connect last node ko head to form a circular list
        temp.next = head;
        n = n % length; // Handle cases where n >= length
        int stepsToNewHead = length - n;
        temp = head;

        // Find  new tail
        for (int i = 1; i < stepsToNewHead; i++) {
            temp = temp.next;
        }

        // Set  new head and break the circular link
        head = temp.next;
        temp.next = null;

        return head;
    }
}
