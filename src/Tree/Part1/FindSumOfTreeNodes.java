package Tree.Part1;

class Node {
    int val;
    node left;
    node right;

    Node(int val) {
        this.val = val;
    }
}

public class FindSumOfTreeNodes {
    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(21);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);
        node f = new node(6);
        node g = new node(25);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        c.left = g;
        // e.right = g; // Remove this line to avoid cycle

//        System.out.println("Value of c: " + c.val);
//        System.out.println("Value of a.left.right: " + a.left.right.val);

        display(a);
        System.out.println();
        System.out.println(sum(a));
    }

    private static int sum(node root) {
        if (root == null) {
            return 0; // Base case: return 0 for null nodes
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    private static void display(node root) {
        if (root == null) {
            return; // Base case: return for null nodes
        }
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}