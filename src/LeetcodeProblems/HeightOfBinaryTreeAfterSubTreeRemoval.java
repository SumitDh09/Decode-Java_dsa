package LeetcodeProblems;

import java.util.HashMap;
import java.util.Map;


class TreeNude {
    int val;
    TreeNude left;
    TreeNude right;
    TreeNude() {}
    TreeNude(int val) { this.val = val; }
    TreeNude(int val, TreeNude left, TreeNude right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class HeightOfBinaryTreeAfterSubTreeRemoval {
    // valToMaxHeight[val] := the maximum height without the node with `val`
    private Map<Integer, Integer> valToMaxHeight = new HashMap<>();
    // valToHeight[val] := the height of the node with `val`
    private Map<Integer, Integer> valToHeight = new HashMap<>();

    public static void main(String[] args) {
        TreeNude root = new TreeNude(1,
                new TreeNude(3, new TreeNude(2), null),
                new TreeNude(4, new TreeNude(6), new TreeNude(5, null, new TreeNude(7)))
        );
        int[] queries = {4};
        HeightOfBinaryTreeAfterSubTreeRemoval solution = new HeightOfBinaryTreeAfterSubTreeRemoval();
        int[] result = solution.treeQueries(root, queries);
        for (int res : result) {
            System.out.println(res);
        }
    }

    public int[] treeQueries(TreeNude root, int[] queries) {
        int[] ans = new int[queries.length];

        dfs(root, 0, 0);

        for (int i = 0; i < queries.length; ++i)
            ans[i] = valToMaxHeight.get(queries[i]);

        return ans;
    }

    private int height(TreeNude root) {
        if (root == null)
            return 0;
        if (valToHeight.containsKey(root.val))
            return valToHeight.get(root.val);
        final int h = 1 + Math.max(height(root.left), height(root.right));
        valToHeight.put(root.val, h);
        return h;
    }

    // maxHeight := the maximum height without the current node `root`
    private void dfs(TreeNude root, int depth, int maxHeight) {
        if (root == null)
            return;
        valToMaxHeight.put(root.val, maxHeight);
        dfs(root.left, depth + 1, Math.max(maxHeight, depth + height(root.right)));
        dfs(root.right, depth + 1, Math.max(maxHeight, depth + height(root.left)));
    }
}
