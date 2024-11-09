package LeetcodeProblems.ModuleLeetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeeNode {
    int val;
    TreeeNode left;
    TreeeNode right;

    TreeeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeRightSideView {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        BinaryTreeRightSideView obj = new BinaryTreeRightSideView();
        System.out.println("Right side view: " + obj.rightSideView(root));
        // Expected output: [1, 3, 4]
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                if (i == levelSize - 1) {
                    result.add(currentNode.val);
                }
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        return result;
    }
}
