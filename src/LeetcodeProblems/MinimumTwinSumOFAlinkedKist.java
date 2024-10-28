package LeetcodeProblems;
class LeetNode {
    int val;
    LeetNode next;

    LeetNode(int val) {
        this.val = val;
    }
}

class MinimumTwinSumOFAlinkedKist {
    public static void main(String[] args) {
        MinimumTwinSumOFAlinkedKist obj = new MinimumTwinSumOFAlinkedKist();
        LeetNode head = new LeetNode(5);
        head.next = new LeetNode(4);
        head.next.next = new LeetNode(2);
        head.next.next.next = new LeetNode(1);
        int result = obj.pairSum(head);
        System.out.println("Maximum twin sum of the linked list: " + result);
    }

    public int pairSum(LeetNode head) {
        int ans = 0;
        LeetNode slow = head;
        LeetNode fast = head;
        // `slow` points to the start of the second half.
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // `tail` points to the end of the reversed second half.
        LeetNode tail = reverseList(slow);
        while (tail != null) {
            ans = Math.max(ans, head.val + tail.val);
            head = head.next;
            tail = tail.next;
        }
        return ans;
    }

    private LeetNode reverseList(LeetNode head) {
        LeetNode prev = null;
        while (head != null) {
            LeetNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}
