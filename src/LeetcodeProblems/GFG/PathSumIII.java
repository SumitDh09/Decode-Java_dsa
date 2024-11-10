package LeetcodeProblems.GFG;


class TNODE {
    int val;
    TNODE left;
    TNODE right;

    TNODE(int val) {
        this.val = val;
    }
}

public class PathSumIII {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TNODE root = new TNODE(10);
        root.left = new TNODE(5);
        root.right = new TNODE(-3);
        root.left.left = new TNODE(3);
        root.left.right = new TNODE(2);
        root.right.right = new TNODE(11);
        root.left.left.left = new TNODE(3);
        root.left.left.right = new TNODE(-2);
        root.left.right.right = new TNODE(1);

        PathSumIII obj = new PathSumIII();
        int targetSum = 8;
        System.out.println("Number of paths with sum " + targetSum + ": " + obj.pathSum(root, targetSum)); // Expected output: 3
    }

    public int pathSum(TNODE root, int targetSum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
    }

    private int dfs(TNODE node, int targetSum) {
        if (node == null) {
            return 0;
        }
        int count = 0;
        if (node.val == targetSum) {
            count++;
        }
        count += dfs(node.left, targetSum - node.val);
        count += dfs(node.right, targetSum - node.val);
        return count;
    }
}

