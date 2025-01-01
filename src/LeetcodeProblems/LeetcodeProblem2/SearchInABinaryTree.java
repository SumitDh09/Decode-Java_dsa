package LeetcodeProblems.LeetcodeProblem2;

class TreeNode {
    int val;
    TReeNode left;
    TReeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SearchInABinaryTree {
    public static void main(String[] args) {
        SearchInABinaryTree obj = new SearchInABinaryTree();

        // Creating a sample BST
        TReeNode root = new TReeNode(4);
        root.left = new TReeNode(2);
        root.right = new TReeNode(7);
        root.left.left = new TReeNode(1);
        root.left.right = new TReeNode(3);

        int val = 2;
        TReeNode result = obj.searchBST(root, val);
        if (result != null) {
            System.out.println("Subtree rooted with node value " + val + ":");
            printTree(result);
        } else {
            System.out.println("Node with value " + val + " not found.");
        }
    }

    public static void printTree(TReeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    public TReeNode searchBST(TReeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return searchBST(root.right, val);
        }
    }
}
