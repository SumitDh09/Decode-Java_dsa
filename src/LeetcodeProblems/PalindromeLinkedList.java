/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
package LeetcodeProblems;

import java.util.List;
import java.util.Stack;

class LiistNode {
    int val;
    LiistNode next;

    LiistNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeLinkedList {

     public static void main(String[] args) {
         // Example usage:
         ListNode head = new ListNode(1);
         head.next = new ListNode(2);
         head.next.next = new ListNode(2);
         head.next.next.next = new ListNode(1);

         System.out.println(isPalindrome(head)); // Output: true
     }

    public static boolean isPalindrome(ListNode head) {
        Stack<ListNode> reverse = new Stack<>();

        ListNode dummy = head;
        while (dummy != null) {
            reverse.push(dummy);
            dummy = dummy.next;
        }

        // Match the list with its reverse which is stored in the stack
        while (head != null && !reverse.isEmpty()) {
            if (reverse.pop().val != head.val) {
                return false;
            } else {
                head = head.next;
            }
        }

        return true;
    }
}

//Method --2
/*
package LeetcodeProblems;

import java.util.Stack;

public class PalindromeLinkedList {

    // Definition for singly-linked list.
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // An empty list or a single node is a palindrome
        }

        Stack<ListNode> reverse = new Stack<ListNode>();
        ListNode dummy = head;

        // Push all nodes onto the stack
        while (dummy != null) {
            reverse.push(dummy);
            dummy = dummy.next;
        }

        // Match list with its reverse which is stored in stack
        while (head != null && !reverse.isEmpty()) {
            if (reverse.pop().val != head.val) {
                return false; // Not a palindrome
            }
            head = head.next;
        }
        return true; // Is a palindrome
    }

    public static void main(String[] args) {
        // Example usage
        PalindromeLinkedList palindromeChecker = new PalindromeLinkedList();

        // Create a palindrome linked list: 1 -> 2 -> 2 -> 1
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        // Check if the linked list is a palindrome
        boolean result = palindromeChecker.isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result); // Output: true
    }
}
*/