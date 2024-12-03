package LeetcodeProblems;

/**
 * Definition for a binary tree node.
 */
class TreiNode {
    int val;
    TreiNode left;
    TreiNode right;
    TreiNode() {}
    TreiNode(int val) { this.val = val; }
    TreiNode(int val, TreiNode left, TreiNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class PathSumIIIM2 {
    int total = 0;

    public static void main(String[] args) {
        PathSumIIIM2 solution = new PathSumIIIM2();

        TreiNode root = new TreiNode(10);
        root.left = new TreiNode(5);
        root.right = new TreiNode(-3);
        root.left.left = new TreiNode(3);
        root.left.right = new TreiNode(2);
        root.right.right = new TreiNode(11);
        root.left.left.left = new TreiNode(3);
        root.left.left.right = new TreiNode(-2);
        root.left.right.right = new TreiNode(1);

        int sum = 8;
        System.out.println("Number of paths that sum to " + sum + ": " + solution.pathSum(root, sum)); // Expected output: 3
    }

    public int pathSum(TreiNode root, int sum) {
        if (root == null) return 0;
        helper(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);
        return total;
    }

    void helper(TreiNode root, int sum, long curr) {
        if (root == null) return;
        curr += root.val;
        if (curr == sum) total++;
        helper(root.left, sum, curr);
        helper(root.right, sum, curr);
    }
}

