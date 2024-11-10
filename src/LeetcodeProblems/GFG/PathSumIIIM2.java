package LeetcodeProblems.GFG;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class PathSumIIIM2 {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(-3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(2);
        root.right.right = new TreeNode(11);
        root.left.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(-2);
        root.left.right.right = new TreeNode(1);

        PathSumIIIM2 obj = new PathSumIIIM2();
        int targetSum = 8;
        System.out.println("Number of paths with sum " + targetSum + ": " + obj.pathSum(root, targetSum)); // Expected output: 3
    }

    public int pathSum(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null)
            return 0;
        return (sum == root.val ? 1 : 0) +
                dfs(root.left, sum - root.val) +
                dfs(root.right, sum - root.val);
    }
}

