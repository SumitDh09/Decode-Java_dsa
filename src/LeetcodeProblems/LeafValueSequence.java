package LeetcodeProblems;


import java.util.ArrayList;
import java.util.List;

class vreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    vreeNode(int val) {
        this.val = val;
    }
}

public class LeafValueSequence {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        LeafValueSequence obj = new LeafValueSequence();
        List<Integer> leafSequence = obj.getLeafSequence(root);
        System.out.println("Leaf value sequence: " + leafSequence); // Expected output: [6, 7, 4, 9, 8]
    }

    public List<Integer> getLeafSequence(TreeNode root) {
        List<Integer> leafSequence = new ArrayList<>();
        dfs(root, leafSequence);
        return leafSequence;
    }

    private void dfs(TreeNode node, List<Integer> leafSequence) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leafSequence.add(node.val);
        }
        dfs(node.left, leafSequence);
        dfs(node.right, leafSequence);
    }
}

