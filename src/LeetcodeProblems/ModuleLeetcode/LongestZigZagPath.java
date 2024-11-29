package LeetcodeProblems.ModuleLeetcode;

class TreeNode {
    int val;
    TreNode left;
    TreNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class LongestZigZagPath {
    private int maxLength = 0;

    public static void main(String[] args) {
        // Creating a sample binary tree
        TreNode root = new TreNode(1);
        root.right = new TreNode(1);
        root.right.left = new TreNode(1);
        root.right.right = new TreNode(1);
        root.right.left.right = new TreNode(1);
        root.right.right.left = new TreNode(1);
        root.right.right.right = new TreNode(1);

        LongestZigZagPath obj = new LongestZigZagPath();
        System.out.println("Longest ZigZag path length: " + obj.longestZigZag(root)); // Expected output: 3
    }

    public int longestZigZag(TreNode root) {
        dfs(root, true, 0);
        dfs(root, false, 0);
        return maxLength;
    }

    private void dfs(TreNode node, boolean isLeft, int length) {
        if (node == null) {
            return;
        }
        maxLength = Math.max(maxLength, length);
        if (isLeft) {
            dfs(node.left, false, length + 1);
            dfs(node.right, true, 1);
        } else {
            dfs(node.right, true, length + 1);
            dfs(node.left, false, 1);
        }
    }
}
