package Tree;

import java.util.LinkedList;
import java.util.Queue;

class TreeNoode {
    int val;
    TreeNoode left;
    TreeNoode right;
    TreeNoode(int val) {
        this.val = val;
    }
}

public class MaximumLevelSum {
    public static void main(String[] args) {
        MaximumLevelSum solution = new MaximumLevelSum();

        TreeNoode root1 = new TreeNoode(1);
        root1.left = new TreeNoode(7);
        root1.right = new TreeNoode(0);
        root1.left.left = new TreeNoode(7);
        root1.left.right = new TreeNoode(-8);
        System.out.println("Smallest level with maximum sum: " + solution.maxLevelSum(root1)); // Expected output: 2

        TreeNoode root2 = new TreeNoode(989);
        root2.right = new TreeNoode(10250);
        root2.right.left = new TreeNoode(98693);
        root2.right.right = new TreeNoode(-89388);
        root2.right.right.right = new TreeNoode(-32127);
        System.out.println("Smallest level with maximum sum: " + solution.maxLevelSum(root2)); // Expected output: 2
    }

    public int maxLevelSum(TreeNoode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNoode> queue = new LinkedList<>();
        queue.offer(root);
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        int currentLevel = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            int levelSum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNoode node = queue.poll();
                levelSum += node.val;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }

            if (levelSum > maxSum) {
                maxSum = levelSum;
                maxLevel = currentLevel;
            }

            currentLevel++;
        }

        return maxLevel;
    }
}

