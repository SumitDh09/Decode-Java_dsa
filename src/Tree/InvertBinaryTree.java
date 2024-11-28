package Tree;

class TreeNode {
    int val;
    Treenode left;
    Treenode right;
    TreeNode(int val) {
        this.val = val;
    // LC --> 226
    }
}

public class InvertBinaryTree {
    public static void main(String[] args) {
        InvertBinaryTree solution = new InvertBinaryTree();

        Treenode root = new Treenode(4);
        root.left = new Treenode(2);
        root.right = new Treenode(7);
        root.left.left = new Treenode(1);
        root.left.right = new Treenode(3);
        root.right.left = new Treenode(6);
        root.right.right = new Treenode(9);

        System.out.println("Original Tree:");
        printTree(root);

        Treenode invertedRoot = solution.invertTree(root);

        System.out.println("Inverted Tree:");
        printTree(invertedRoot);
    }

    public static void printTree(Treenode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }

    public void invert(Treenode root) {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            return;
        Treenode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invert(root.left);
        invert(root.right);
    }

    public Treenode invertTree(Treenode root) {
        invert(root);
        return root;
    }
}
