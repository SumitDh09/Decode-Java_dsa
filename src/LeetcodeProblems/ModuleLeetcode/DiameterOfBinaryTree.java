package LeetcodeProblems.ModuleLeetcode;

class TreNode {
    int val;
    TreNode left;
    TreNode right;
    TreNode(int val) {
        this.val = val;
    }
}

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreNode root = new TreNode(1);
        root.left = new TreNode(2);
        root.right = new TreNode(3);
        root.left.left = new TreNode(4);
        root.left.right = new TreNode(5);

        System.out.println("Diameter of the binary tree: " + solution.diameterOfBinaryTree(root)); // Expected output: 3
    }

    public int levels(TreNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(levels(root.left), levels(root.right));
    }

    public int diameterOfBinaryTree(TreNode root) {
        if (root == null)
            return 0;
        return levels(root.left) + levels(root.right);
    }
}
/*class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

class DiameterOfBinaryTree {
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return ans;
    }

    int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        final int l = maxDepth(root.left);
        final int r = maxDepth(root.right);
        ans = Math.max(ans, l + r);
        return 1 + Math.max(l, r);
    }

    public static void main(String[] args) {
        DiameterOfBinaryTree solution = new DiameterOfBinaryTree();

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Diameter of the binary tree: " + solution.diameterOfBinaryTree(root)); // Expected output: 3
    }
}
*/
