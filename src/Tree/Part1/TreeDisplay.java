package Tree.Part1;

class node {
    int val;
    node left;
    node right;
    node(int val){
        this.val = val;
    }
}
public class TreeDisplay {
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
        e.right = g;
        // Set the value of a.left.right directly
        a.left.right.val = 19;

        System.out.println("Value of c: " + c.val);
        System.out.println("Value of a.left.right: " + a.left.right.val);

        display(a);
    }

    private static void display(node root) {
        if (root == null) {
            return; // Base case:-->
            // if the node is null, return
        }
        System.out.print(root.val + " ");
        display(root.left);
        // Display left subtree
        display(root.right);
        // Display right subtree
    }
}


