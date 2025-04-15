package AccessModifiers;

import java.util.Stack;

// Definition for singly-linked list
class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class PalindromeLinkedList {

    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        System.out.println("Is Palindrome? " + isPalindrome(head)); // Output: true
    }

    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        Stack<Integer> reverse = new Stack<>();
        ListNode dummy = head;

        // Push all values onto the stack
        while (dummy != null) {
            reverse.push(dummy.val);
            dummy = dummy.next;
        }

        // Match list with its reversed values stored in the stack
        while (head != null) {
            if (reverse.pop() != head.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
