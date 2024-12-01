package Tree;

import java.util.ArrayList;
import java.util.List;

class TrieNode {
    int val;
    TrieNode left;
    TrieNode right;
    TrieNode(int val) {
        this.val = val;
    }
}

class BinaryTreePaths {
    public static void main(String[] args) {
        BinaryTreePaths solution = new BinaryTreePaths();

        TrieNode root = new TrieNode(1);
        root.left = new TrieNode(2);
        root.right = new TrieNode(3);
        root.left.right = new TrieNode(5);

        List<String> result = solution.binaryTreePaths(root);
        System.out.println("Binary Tree Paths: " + result); // Expected output: ["1->2->5", "1->3"]
    }

    public void path(TrieNode root, String s, List<String> ans) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            s += root.val;
            ans.add(s);
            return;
        }
        path(root.left, s + root.val + "->", ans);
        path(root.right, s + root.val + "->", ans);
    }

    public List<String> binaryTreePaths(TrieNode root) {
        List<String> ans = new ArrayList<>();
        path(root, "", ans);
        return ans;
    }
}

