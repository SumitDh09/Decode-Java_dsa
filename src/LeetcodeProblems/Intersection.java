package LeetcodeProblems;
class lNode {
    int val;
    LNode next;

    lNode(int x) {
        val = x;
        next = null;
    }
}

public class Intersection {
    public static void main(String[] args) {
        Intersection obj = new Intersection();

        // Creating two linked lists with an intersection
        LNode headA = new LNode(4);
        headA.next = new LNode(1);
        LNode intersect = new LNode(8);
        headA.next.next = intersect;
        intersect.next = new LNode(4);
        intersect.next.next = new LNode(5);

        LNode headB = new LNode(5);
        headB.next = new LNode(6);
        headB.next.next = new LNode(1);
        headB.next.next.next = intersect;

        LNode intersectionNode = obj.getIntersectionNode(headA, headB);
        if (intersectionNode != null) {
            System.out.println("Intersection node value: " + intersectionNode.val); // Expected output: 8
        } else {
            System.out.println("No intersection");
        }
    }

    private LNode getIntersectionNode(LNode headA, LNode headB) {
        // If either list is empty, there can be no intersection
        if (headA == null || headB == null) {
            return null;
        }

        // Initialize two pointers
        LNode pointerA = headA;
        LNode pointerB = headB;

        // Traverse both lists
        while (pointerA != pointerB) {
            // Move pointerA to the next node
            pointerA = pointerA == null ? headB : pointerA.next;
            // Move pointerB to the next node
            pointerB = pointerB == null ? headA : pointerB.next;
        }

        // At this point, pointerA and pointerB are either at the intersection
        // or both are null (no intersection)
        return pointerA;
    }
}
