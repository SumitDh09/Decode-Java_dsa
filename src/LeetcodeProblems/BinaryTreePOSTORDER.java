package LeetcodeProblems;

import java.util.*;

class TreeeNoode {
    int val;
    TreeeNoode left;
    TreeeNoode right;
    TreeeNoode(int val){this.val = val;
    }
}

public class BinaryTreePOSTORDER {
    public static void main(String[] args) {
        BinaryTreePOSTORDER solution = new BinaryTreePOSTORDER();

        TreeeNoode root1 = new TreeeNoode(1);
        root1.left = new TreeeNoode(2);
        root1.right = new TreeeNoode(3);
        root1.left.left = new TreeeNoode(4);
        root1.left.right = new TreeeNoode(5);
        root1.right.left = new TreeeNoode(6);
        root1.right.right = new TreeeNoode(7);

        List<Integer> result = solution.postorderTraversal(root1);
        System.out.println("Postorder Traversal: " + result); // Expected output: [4, 5, 2, 6, 7, 3, 1]
    }

    public List<Integer> postorderTraversal(TreeeNoode root) {
        if (root == null)
            return new ArrayList<>();

        List<Integer> ans = new ArrayList<>();
        Deque<TreeeNoode> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            root = stack.pop();
            ans.add(root.val);
            if (root.left != null)
                stack.push(root.left);
            if (root.right != null)
                stack.push(root.right);
        }

        Collections.reverse(ans);
        return ans;
    }
}
