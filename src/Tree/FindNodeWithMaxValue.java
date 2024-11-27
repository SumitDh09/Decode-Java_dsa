package Tree;

// Define the NodE class with a constructor to initialize node value
class Noode {
    int val;
    Noode left;
    Noode right;

    Noode(int val) {
        this.val = val;
    }
}

public class FindNodeWithMaxValue {
    // Main method to find the node with max value & find the size of binary tree
    public static void main(String[] args) {
        Noode a = new Noode(1);
        Noode b = new Noode(21);
        Noode c = new Noode(3);
        Noode d = new Noode(4);
        Noode e = new Noode(5);
        Noode f = new Noode(6);

        // Constructing the tree
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        // Changing the value of a specific node
        a.left.right.val = 19;

        // Displaying the tree
        System.out.print("Tree nodes in pre-order: ");
        display(a);
        System.out.println();

        // Displaying specific node values
        System.out.println("Value of c: " + c.val);
        System.out.println("Value of a.left.right: " + a.left.right.val);

        // Calculating and displaying the sum and max value
        System.out.println("Sum of all nodes: " + sum(a));
        System.out.println("Maximum value in the tree: " + max(a));
    }

    // Method to calculate the sum of all nodes
    private static int sum(Noode root) {
        if (root == null) {
            return 0; // Base case: return 0 for null nodes
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    // Method to find the maximum value in the tree
    private static int max(Noode root) {
        if (root == null) {
            return Integer.MIN_VALUE; // Base case: return the smallest integer for null nodes
        }
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    // Method to display the tree nodes in pre-order
    private static void display(Noode root) {
        if (root == null) {
            return; // Base case: return for null nodes
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}
