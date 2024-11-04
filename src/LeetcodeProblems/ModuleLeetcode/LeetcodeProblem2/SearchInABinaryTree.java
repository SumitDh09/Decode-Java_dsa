package LeetcodeProblems.ModuleLeetcode.LeetcodeProblem2;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SearchInABinaryTree {
    public static void main(String[] args) {
        SearchInABinaryTree obj = new SearchInABinaryTree();

        // Creating a sample BST
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        int val = 2;
        TreeNode result = obj.searchBST(root, val);
        if (result != null) {
            System.out.println("Subtree rooted with node value " + val + ":");
            printTree(result);
        } else {
            System.out.println("Node with value " + val + " not found.");
        }
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
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
