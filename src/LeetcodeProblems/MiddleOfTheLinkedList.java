package LeetcodeProblems;

class LstNode {
    int val;
    LstNode next;

    LstNode(int val) {
        this.val = val;
    }
}

class MiddleOfTheLinkedList {
    public static void main(String[] args) {
        MiddleOfTheLinkedList obj = new MiddleOfTheLinkedList();
        LstNode head = new LstNode(1);
        head.next = new LstNode(2);
        head.next.next = new LstNode(3);
        head.next.next.next = new LstNode(4);
        head.next.next.next.next = new LstNode(5);

        LstNode middle = obj.middleNode(head);
        System.out.println("Middle node value: " + middle.val); // Expected output: 3
    }

    public LstNode middleNode(LstNode head) {
        LstNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        int mid = len / 2;
        temp = head;
        for (int i = 0; i < mid; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
