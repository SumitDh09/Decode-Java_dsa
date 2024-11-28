package LeetcodeProblems;

import java.util.*;

class TreeNoode {
    int val;
    TreeeNoode left;
    TreeeNoode right;
    TreeNoode(int val) {
        this.val = val;
//        LC-->144 Method --> 1
    }
}

public class BinaryTreePREORDER {

    public static void main(String[] args) {
        BinaryTreePREORDER solution = new BinaryTreePREORDER();

        TreeeNoode root1 = new TreeeNoode(1);
        root1.left = new TreeeNoode(2);
        root1.right = new TreeeNoode(3);
        root1.left.left = new TreeeNoode(4);
        root1.left.right = new TreeeNoode(5);
        root1.right.left = new TreeeNoode(6);
        root1.right.right = new TreeeNoode(7);

        List<Integer> result = solution.preorderTraversal(root1);
        System.out.println("Preorder Traversal: " + result); // Expected output: [1, 2, 4, 5, 3, 6, 7]
    }

    public List<Integer> preorderTraversal(TreeeNoode root) {
        List<Integer> ans = new ArrayList<>();
        preorder(root, ans);
        return ans;
    }

    private void preorder(TreeeNoode root, List<Integer> ans) {
        if (root == null)
            return;

        ans.add(root.val);
        preorder(root.left, ans);
        preorder(root.right, ans);
    }
}
