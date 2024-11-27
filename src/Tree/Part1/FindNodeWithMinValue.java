package Tree.Part1;

// Define the Node class with a constructor to initialize node value
class Noodee {
    int val;
    Noodee left;
    Noodee right;

    Noodee(int val) {
        this.val = val;
    }
}

public class FindNodeWithMinValue {
    // Main method to find the node with max value, min value, and sum of the binary tree
    public static void main(String[] args) {
        Noodee a = new Noodee(1);
        Noodee b = new Noodee(21);
        Noodee c = new Noodee(3);
        Noodee d = new Noodee(4);
        Noodee e = new Noodee(5);
        Noodee f = new Noodee(6);

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

        // Calculating and displaying the sum, max value, and min value
        System.out.println("Sum of all nodes: " + sum(a));
        System.out.println("Maximum value in the tree: " + max(a));
        System.out.println("Minimum value in the tree: " + min(a));
    }

    // Method to calculate the sum of all nodes
    private static int sum(Noodee root) {
        if (root == null) {
            return 0; // Base case: return 0 for null nodes
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    // Method to find the maximum value in the tree
    private static int max(Noodee root) {
        if (root == null) {
            return Integer.MIN_VALUE; // Base case: return the smallest integer for null nodes
        }
        return Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }

    // Method to find the minimum value in the tree
    private static int min(Noodee root) {
        if (root == null) {
            return Integer.MAX_VALUE; // Base case: return the largest integer for null nodes
        }
        return Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }

    // Method to display the tree nodes in pre-order
    private static void display(Noodee root) {
        if (root == null) {
            return; // Base case: return for null nodes
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}
