package LeetcodeProblems;


import java.util.ArrayList;
import java.util.List;

class TareeNode {
    int val;
    TareeNode left;
    TreeNode right;

    TareeNode(int val) {
        this.val = val;
    }
}

class LeafValueSequenceII {
    public static void main(String[] args) {
        // Creating sample binary trees
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(7);
        root2.right.left = new TreeNode(4);
        root2.right.right = new TreeNode(2);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.right = new TreeNode(8);

        LeafValueSequenceII obj = new LeafValueSequenceII();
        System.out.println("Are the leaf sequences similar ? " + obj.leafSimilar(root1, root2)); // Expected output: true
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        dfs(root1, leaves1);
        dfs(root2, leaves2);
        return leaves1.equals(leaves2);
    }

    public void dfs(TreeNode node, List<Integer> leaves) {
        if (node == null)
            return;
        if (node.left == null && node.right == null) {
            leaves.add(node.val);
            return;
        }

        dfs(node.left, leaves);
        dfs(node.right, leaves);
    }
}

