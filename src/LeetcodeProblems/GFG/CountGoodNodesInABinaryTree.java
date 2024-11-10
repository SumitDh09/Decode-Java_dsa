package LeetcodeProblems.GFG;


class TrieNode {
    int val;
    TreeNode left;
    TreeNode right;

    TrieNode(int val) {
        this.val = val;
    }
}

public class CountGoodNodesInABinaryTree {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(5);

        CountGoodNodesInABinaryTree obj = new CountGoodNodesInABinaryTree();
        System.out.println("Number of good nodes: " + obj.goodNodes(root)); // Expected output: 4
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode node, int maxVal) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val >= maxVal) {
            count = 1;
            maxVal = node.val;
        }
        count += dfs(node.left, maxVal);
        count += dfs(node.right, maxVal);
        return count;
    }
}

