package LeetcodeProblems.LeetcodeProblem2;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class IntersectionII {
    public static void main(String[] args) {
        // Example usage
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        ListNode intersection = new ListNode(3);
        headA.next.next = intersection;
        intersection.next = new ListNode(4);
        intersection.next.next = new ListNode(5);

        ListNode headB = new ListNode(6);
        headB.next = new ListNode(7);
        headB.next.next = intersection; // Create intersection

        IntersectionII solution = new IntersectionII();
        ListNode result = solution.getIntersectionNode(headA, headB);
        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Calculate the lengths of both linked lists
        int lenA = 0;
        ListNode tempA = headA;
        while (tempA != null) {
            tempA = tempA.next;
            lenA++;
        }

        int lenB = 0;
        ListNode tempB = headB;
        while (tempB != null) {
            tempB = tempB.next;
            lenB++;
        }

        // Reset tempA and tempB to the heads of the lists
        tempA = headA;
        tempB = headB;

        // Adjust the starting point for the longer list
        if (lenA > lenB) {
            for (int i = 0; i < lenA - lenB; i++) {
                tempA = tempA.next;
            }
        } else {
            for (int i = 0; i < lenB - lenA; i++) {
                tempB = tempB.next;
            }
        }

        // Traverse both lists together to find the intersection
        while (tempA != null && tempB != null) {
            if (tempA == tempB) {
                return tempA; // Intersection found
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null; // No intersection
    }
}