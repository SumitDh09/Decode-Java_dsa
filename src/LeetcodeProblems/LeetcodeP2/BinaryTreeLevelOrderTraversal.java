package LeetcodeProblems.LeetcodeP2;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { this.val = val; }
}

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);

        System.out.println("Output for root1: " + solution.levelOrder(root1)); // Output: [[3], [9, 20], [15, 7]]

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        System.out.println("Output for root2: " + solution.levelOrder(root2)); // Output: [[1], [2, 3], [4, 5, 6, 7]]
    }

    private int levels(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    private void nThLevel(TreeNode root, int Level, int lvl, List<Integer> arr) {
        if (root == null) return;
        if (Level == lvl) arr.add(root.val);
        nThLevel(root.left, Level + 1, lvl, arr);
        nThLevel(root.right, Level + 1, lvl, arr);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = levels(root);
        for (int i = 0; i <= lvl - 1; i++) {
            List<Integer> arr = new ArrayList<>();
            nThLevel(root, 0, i, arr);
            ans.add(arr);
        }
        return ans;
    }
}
