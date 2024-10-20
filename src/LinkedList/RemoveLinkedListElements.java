package LinkedList;

class Nade {
    int val;
    Nade next;

    Nade(int x) { val = x; }
}

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        Nade head = new Nade(1);
        head.next = new Nade(2);
        head.next.next = new Nade(6);
        head.next.next.next = new Nade(3);
        head.next.next.next.next = new Nade(4);
        head.next.next.next.next.next = new Nade(5);
        head.next.next.next.next.next.next = new Nade(6);

        int val = 6;
        Nade newHead = removeLinkedListElements.removeElements(head, val);

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
    public Nade removeElements(Nade head, int val) {
        // Create a dummy node to simplify the edge case where the head node needs to be removed
        Nade dummy = new Nade(0);
        dummy.next = head;
        Nade prev = dummy;

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
