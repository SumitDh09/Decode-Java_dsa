package Tree;

import java.util.*;

class NOODIEE {
    int val;
    NOODIEE left;
    NOODIEE right;
    NOODIEE(int val) {
        this.val = val;
//       without Using Queue
    }
}

public class PrintTheElementsNthLvlM2 {
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NOODIEE a = new NOODIEE(1);
        NOODIEE b = new NOODIEE(2);
        NOODIEE c = new NOODIEE(3);
        NOODIEE d = new NOODIEE(4);
        NOODIEE e = new NOODIEE(5);
        NOODIEE f = new NOODIEE(6);
        NOODIEE g = new NOODIEE(7);
        NOODIEE h = new NOODIEE(8);
        NOODIEE i = new NOODIEE(9);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
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
        System.out.println();
//        System.out.println("Level Order : ");
//        LevelOrder(a);
        for (int x = 0; x <=3; x++){
            n = x;
            nThLevel(a,0);
            System.out.println();
        }
    }

    private static void nThLevel(NOODIEE root, int Level) {
        if (root == null) return;
        if (Level == n) System.out.print(root.val + " ");
        nThLevel(root.left, Level + 1);
        nThLevel(root.right, Level + 1);
    }

//    private static void LevelOrder(NOODIEE root) {
//        Queue<NOODIEE> q = new LinkedList<>();
//        if (root != null) q.add(root);
//        while (!q.isEmpty()) {
//            NOODIEE front = q.remove();
//            System.out.print(front.val + " ");
//            if (front.left != null) q.add(front.left);
//            if (front.right != null) q.add(front.right);
//        }
//        System.out.println();
//    }

    private static void preOrder(NOODIEE root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(NOODIEE root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }

    private static void postOrder(NOODIEE root) {
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");
    }
}
