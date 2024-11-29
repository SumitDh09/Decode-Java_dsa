package LeetcodeProblems;


import java.util.ArrayList;
import java.util.List;

class vreeNode {
    int val;
    TrEeNode left;
    TrEeNode right;

    vreeNode(int val) {
        this.val = val;
    }
}

public class LeafValueSequence {
    public static void main(String[] args) {
        // Creating a sample binary tree
        TrEeNode root = new TrEeNode(3);
        root.left = new TrEeNode(5);
        root.right = new TrEeNode(1);
        root.left.left = new TrEeNode(6);
        root.left.right = new TrEeNode(2);
        root.right.left = new TrEeNode(9);
        root.right.right = new TrEeNode(8);
        root.left.right.left = new TrEeNode(7);
        root.left.right.right = new TrEeNode(4);

        LeafValueSequence obj = new LeafValueSequence();
        List<Integer> leafSequence = obj.getLeafSequence(root);
        System.out.println("Leaf value sequence: " + leafSequence); // Expected output: [6, 7, 4, 9, 8]
    }

    public List<Integer> getLeafSequence(TrEeNode root) {
        List<Integer> leafSequence = new ArrayList<>();
        dfs(root, leafSequence);
        return leafSequence;
    }

    private void dfs(TrEeNode node, List<Integer> leafSequence) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leafSequence.add(node.val);
        }
        dfs(node.left, leafSequence);
        dfs(node.right, leafSequence);
    }
}

