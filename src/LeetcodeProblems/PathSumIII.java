package LeetcodeProblems;

class TreNode {
    int val;
    TreNode left;
    TreNode right;

    TreNode(int val) {
        this.val = val;
    }
}

public class PathSumIII {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TreNode root = new TreNode(10);
        root.left = new TreNode(5);
        root.right = new TreNode(-3);
        root.left.left = new TreNode(3);
        root.left.right = new TreNode(2);
        root.right.right = new TreNode(11);
        root.left.left.left = new TreNode(3);
        root.left.left.right = new TreNode(-2);
        root.left.right.right = new TreNode(1);

        PathSumIII obj = new PathSumIII();
        int targetSum = 8;
        int result = obj.pathSum(root, targetSum);
        System.out.println("Number of paths that sum to " + targetSum + ": " + result); // Expected output: 3
    }

    public int pathSum(TreNode root, int sum) {
        if (root == null)
            return 0;
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int dfs(TreNode root, int sum) {
        if (root == null)
            return 0;
        return (sum == root.val ? 1 : 0) +   //
                dfs(root.left, sum - root.val) + //
                dfs(root.right, sum - root.val);
    }
}
