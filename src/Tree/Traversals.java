package Tree;

class Nodeee {
    int val;
   Nodeee left;
    Nodeee right;
    Nodeee(int val){
        this.val = val;
//      LC-->144 Method --> 2
    }
}
public class Traversals {
    public static void main(String[] args) {
        Nodeee a = new Nodeee(1);
        Nodeee b = new Nodeee(2);
        Nodeee c = new Nodeee(3);
        Nodeee d = new Nodeee(4);
        Nodeee e = new Nodeee(5);
        Nodeee f = new Nodeee(6);
        Nodeee g = new Nodeee(7);
        Nodeee h = new Nodeee(8);
        Nodeee i = new Nodeee(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g; // Corrected this line
        e.left = h;
        f.right = i;

        System.out.print("Preorder --> ");
        preOrder(a);
        System.out.println();
        System.out.print("Inorder --> ");
        inOrder(a);
        System.out.println();
        System.out.print("Postorder --> ");
        postOrder(a);
    }

    private static void preOrder(Nodeee root) {
        if (root == null) return; // Base case: return for null nodes
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Nodeee root) {
        if (root == null) return; // Base case: return for null nodes
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private static void postOrder(Nodeee root) {
        if (root == null) return; // Base case: return for null nodes
        postOrder(root.left);
        System.out.print(root.val + " ");
        postOrder(root.right);
    }
}
