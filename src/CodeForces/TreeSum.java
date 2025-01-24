package CodeForces;

import java.util.*;

class TreeNode {
    List<Integer> children;

    TreeNode() {
        children = new ArrayList<>();
    }
}

public class TreeSum {
    static int[][] up;
    static int[] depth;
    static int maxLog;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            TreeNode[] tree = new TreeNode[n + 1];
            for (int i = 1; i <= n; i++) {
                tree[i] = new TreeNode();
            }
            for (int i = 1; i < n; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                tree[u].children.add(v);
                tree[v].children.add(u);
            }

            prepareLCA(tree, n);

            long result = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    if (!isGoodPair(i, j)) continue;
                    int lca = lca(i, j);
                    int d1 = depth[i] - depth[lca];
                    int d2 = depth[j] - depth[lca];
                    int minSide = Math.abs(d1 - d2) + 1;
                    int maxSide = d1 + d2;
                    result += Math.max(0, maxSide - minSide + 1);
                }
            }
            System.out.println(result);
        }
        scanner.close();
    }

    static void prepareLCA(TreeNode[] tree, int n) {
        maxLog = Integer.numberOfTrailingZeros(Integer.highestOneBit(n)) + 1;
        up = new int[n + 1][maxLog];
        depth = new int[n + 1];
        Arrays.fill(depth, -1);
        dfs(tree, 1, -1, 0);
    }

    static void dfs(TreeNode[] tree, int node, int parent, int dep) {
        depth[node] = dep;
        up[node][0] = parent;
        for (int i = 1; i < maxLog; i++) {
            if (up[node][i - 1] != -1) {
                up[node][i] = up[up[node][i - 1]][i - 1];
            }
        }
        for (int child : tree[node].children) {
            if (child != parent) {
                dfs(tree, child, node, dep + 1);
            }
        }
    }

    static int lca(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u; u = v; v = temp;
        }
        for (int i = 0; i < maxLog; i++) {
            if (((depth[u] - depth[v]) >> i & 1) == 1) {
                u = up[u][i];
            }
        }
        if (u == v) return u;
        for (int i = maxLog - 1; i >= 0; i--) {
            if (up[u][i] != up[v][i]) {
                u = up[u][i];
                v = up[v][i];
            }
        }
        return up[u][0];
    }

    static boolean isGoodPair(int u, int v) {
        return !(isAncestor(u, v) || isAncestor(v, u));
    }

    static boolean isAncestor(int a, int b) {
        while (b != -1 && b != a) {
            b = up[b][0];
        }
        return b == a;
    }
}