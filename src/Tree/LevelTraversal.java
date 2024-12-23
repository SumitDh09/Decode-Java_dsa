package Tree;

import java.util.*;

class Nodie {
    int val;
    Nodie left;
    Nodie right;
    Nodie(int val){
        this.val = val;


    }
}
public class LevelTraversal {
    public static void main() {
        Nodie a = new Nodie(1);
        Nodie b = new Nodie(2);
        Nodie c = new Nodie(3);
        Nodie d = new Nodie(4);
        Nodie e = new Nodie(5);
        Nodie f = new Nodie(6);
        Nodie g = new Nodie(7);
        Nodie h = new Nodie(8);
        Nodie i = new Nodie(9);

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
        System.out.println("Level Order : ");
        System.out.println();
        LevelOrder(a);
    }
    private static void LevelOrder(Nodie root){
        Queue<Nodie> q = new LinkedList<>();
        if (root != null)q.add(root);
        while(q.size()>0){
            Nodie front = q.remove();
            System.out.println(front.val);
            if (front.left != null)q.add(front.left);
            if (front.right != null)q.add(front.right);

        }



    }

    private static void preOrder(Nodie root) {
        if (root == null) return; // Base case: return for null nodes
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Nodie root) {
        if (root == null) return; // Base case: return for null nodes
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private static void postOrder(Nodie root) {
        if (root == null) return; // Base case: return for null nodes
        postOrder(root.left);
        System.out.print(root.val + " ");
        postOrder(root.right);
    }
}
