package Tree;

class NOde {
    int val;
    Nde left;
    Nde right;

    NOde(int val) {
        this.val = val;
    }
}

public class FindProductOfTreeNodes {
    public static void main(String[] args) {
        Nde a = new Nde(1);
        Nde b = new Nde(2);
        Nde c = new Nde(3);
        Nde d = new Nde(4);
        Nde e = new Nde(5);
        Nde f = new Nde(6);
        Nde g = new Nde(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        System.out.println("Value of c: " + c.val);
        System.out.println("Value of a.left.right: " + a.left.right.val);

        display(a);
        System.out.println();
        System.out.println("Product of all nodes: " + product(a));
    }

    private static int product(Nde root) {
        if (root == null) {
            return 1; // Base case: return 1 for null nodes (multiplicative identity)
        }
        return root.val * product(root.left) * product(root.right);
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