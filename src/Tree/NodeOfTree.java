package Tree;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
    }
}

public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        a.left.right.val = 19;
        System.out.println(c.val);
        System.out.println(a.left.right.val);
    }
}
