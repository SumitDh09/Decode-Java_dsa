package Binarysearch;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getSum(root, false);
    }

    public int getSum(TreeNode root, boolean isLeftChild) {
        if (root.left == null && root.right == null) {
            return (isLeftChild) ? root.val : 0;
        }
        int sum = 0;
        if (root.left != null) {
            sum += getSum(root.left, true);
        }
        if (root.right != null) {
            sum += getSum(root.right, false);
        }
        return sum;
    }

    public static void main(String[] args) {
        SumOfLeftLeaves solution = new SumOfLeftLeaves();

        // Creating a sample tree:
        //       3
        //      / \
        //     9  20
        //       /  \
        //      15   7
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        int result = solution.sumOfLeftLeaves(root);
        System.out.println("Sum of left leaves: " + result); // Output should be 24
    }
}
