package Tree;

class TrEENode {
    int val;
    TrEENode left;
    TrEENode right;
    TrEENode(int val) {
        this.val = val;
    }
}

public class SymmetricTree {
    public static void main(String[] args) {
        SymmetricTree solution = new SymmetricTree();

        TrEENode root1 = new TrEENode(1);
        root1.left = new TrEENode(2);
        root1.right = new TrEENode(2);
        root1.left.left = new TrEENode(3);
        root1.left.right = new TrEENode(4);
        root1.right.left = new TrEENode(4);
        root1.right.right = new TrEENode(3);

        System.out.println("Is the tree symmetric ? " + solution.isSymmetric(root1)); // Expected output: true

        TrEENode root2 = new TrEENode(1);
        root2.left = new TrEENode(2);
        root2.right = new TrEENode(2);
        root2.left.right = new TrEENode(3);
        root2.right.right = new TrEENode(3);

        System.out.println("Is the tree symmetric ? " + solution.isSymmetric(root2)); // Expected output: false
    }

    public boolean isSymmetric(TrEENode root) {
        return isSymmetric(root, root);
    }

    private boolean isSymmetric(TrEENode p, TrEENode q) {
        if (p == null || q == null)
            return p == q;

        return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
    }
}
