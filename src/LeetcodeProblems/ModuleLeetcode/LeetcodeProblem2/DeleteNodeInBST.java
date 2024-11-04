package LeetcodeProblems.ModuleLeetcode.LeetcodeProblem2;

class TReeNode {
    int val;
    TReeNode left;
    TReeNode right;

    TReeNode(int val) {
        this.val = val;
    }
}

public class DeleteNodeInBST {
    public static void main(String[] args) {
        DeleteNodeInBST obj = new DeleteNodeInBST();

        // Creating a sample BST
        TReeNode root = new TReeNode(5);
        root.left = new TReeNode(3);
        root.right = new TReeNode(6);
        root.left.left = new TReeNode(2);
        root.left.right = new TReeNode(4);
        root.right.right = new TReeNode(7);

        int key = 3;
        TReeNode result = obj.deleteNode(root, key);
        System.out.println("BST after deleting node with value " + key + ":");
        printTree(result);
    }

    public static void printTree(TReeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            printTree(root.left);
            printTree(root.right);
        }
    }

    public TReeNode deleteNode(TReeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node to be deleted found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Node with two children: Get the inorder successor (smallest in the right subtree)
            root.val = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteNode(root.right, root.val);
        }

        return root;
    }

    private int minValue(TReeNode root) {
        int minValue = root.val;
        while (root.left != null) {
            root = root.left;
            minValue = root.val;
        }
        return minValue;
    }
}
