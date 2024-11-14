package LeetcodeProblems.ModuleLeetcode;


class TreeNoode {
    int val;
    TreeNoode left;
    TreeNoode right;

    TreeNoode(int val) {
        this.val = val;
    }
}

public class LowestCommonAncestorOfABinaryTree {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNoode root = new TreeNoode(3);
        root.left = new TreeNoode(5);
        root.right = new TreeNoode(1);
        root.left.left = new TreeNoode(6);
        root.left.right = new TreeNoode(2);
        root.right.left = new TreeNoode(0);
        root.right.right = new TreeNoode(8);
        root.left.right.left = new TreeNoode(7);
        root.left.right.right = new TreeNoode(4);

        LowestCommonAncestorOfABinaryTree obj = new LowestCommonAncestorOfABinaryTree();
        TreeNoode p = root.left; // Node with value 5
        TreeNoode q = root.right; // Node with value 1
        TreeNoode lca = obj.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of nodes " + p.val + " and " + q.val + " is: " + lca.val); // Expected output: 3
    }

    public TreeNoode lowestCommonAncestor(TreeNoode root, TreeNoode p, TreeNoode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNoode left = lowestCommonAncestor(root.left, p, q);
        TreeNoode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null) {
            return root;
        }

        return left != null ? left : right;
    }
}

