package Tree;

class Nde {
    int val;
    Nde left;
    Nde right;

    Nde(int val) {
        this.val = val;
    }
}

public class FindProductOfNonZeroTreeNodes {
    public static void main(String[] args) {
        Nde a = new Nde(1);
        Nde b = new Nde(0); // This node has a value of 0
        Nde c = new Nde(3);
        Nde d = new Nde(4);
        Nde e = new Nde(5);
        Nde f = new Nde(0); // This node has a value of 0
        Nde g = new Nde(7);

        // Constructing the tree
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        // Displaying values
        System.out.println("Value of c: " + c.val);
        System.out.println("Value of a.left.right: " + a.left.right.val);

        // Display the tree
        System.out.print("Tree nodes in pre-order: ");
        display(a);
        System.out.println();

        // Calculate and display the product of non-zero nodes
        int product = productOfNonZero(a);
        System.out.println("Product of non-zero nodes: " + product);
    }

    private static int productOfNonZero(Nde root) {
        if (root == null) {
            return 1; // Base case: return 1 for null nodes (multiplicative identity)
        }

        // If the current node's value is zero, skip it
        if (root.val == 0) {
            return productOfNonZero(root.left) * productOfNonZero(root.right);
        }

        // Otherwise, include the current node's value in the product
        return root.val * productOfNonZero(root.left) * productOfNonZero(root.right);
    }

    private static void display(Nde root) {
        if (root == null) {
            return; // Base case: return for null nodes
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}