package LinkedList;

class node {
    int val;
    node next;
    node(int x) { val = x ; }
}

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        node head = new node(1);
        head.next = new node(2);
        head.next.next = new node(6);
        head.next.next.next = new node(3);
        head.next.next.next.next = new node(4);
        head.next.next.next.next.next = new node(5);
        head.next.next.next.next.next.next = new node(6);
        int val = 6;
        node newHead = removeLinkedListElements.removeElements(head, val);
        // Print the resulting linked list
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }

    /**
     * Removes all elements from the linked list that have a value equal to the given val.
     *
     * @param head the head of the linked list
     * @param val the value to be removed
     * @return the new head of the linked list
     */
    public node removeElements(node head, int val) {
        // Create a dummy node to simplify the edge case where the head node needs to be removed
        node dummy = new node(0);
        dummy.next = head;
        node prev = dummy;
        // Iterate through the linked list
        while (prev.next != null) {
            // If the current node's value matches the given val, skip it
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                // Otherwise, move the prev pointer to the next node
                prev = prev.next;
            }
        }
        // Return the new head of the linked list
        return dummy.next;
    }
}
