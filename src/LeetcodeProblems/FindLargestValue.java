package LeetcodeProblems;

import java.util.*;

class trieeNode {
    int val;
    trieeNode left;
    trieeNode right;
    trieeNode(int val) { this.val = val; }
}

public class FindLargestValue {
    public static void main(String[] args) {
        // Create a sample binary tree
        trieeNode root = new trieeNode(1);
        root.left = new trieeNode(3);
        root.right = new trieeNode(2);
        root.left.left = new trieeNode(5);
        root.left.right = new trieeNode(3);
        root.right.right = new trieeNode(9);

        FindLargestValue solution = new FindLargestValue();
        List<Integer> result = solution.largestValues(root);

        System.out.println("Largest values in each level of the binary tree:");
        System.out.println(result);
    }

    public List<Integer> largestValues(trieeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<trieeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < size; i++) {
                trieeNode node = queue.poll();
                max = Math.max(max, node.val);

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            result.add(max);
        }

        return result;
    }
}