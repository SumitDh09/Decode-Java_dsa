package Tree;

import java.util.Stack;

class Noddee {
    int val;
    Nodeee left;
    Nodeee right;
    Noddee(int val){
        this.val = val;
    }
}

public class SecondTraversalsmethod {
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
        c.right = g;
        e.left = h;
        f.right = i;

        System.out.print("Preorder --> ");
        preOrder(a);
        System.out.println();

    }

    private static void preOrder(Nodeee root) {
        if (root == null) return;

        Stack<Nodeee> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Nodeee node = stack.pop();
            System.out.print(node.val + " ");

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    private static void inOrder(Nodeee root) {
        if (root == null) return;

        Stack<Nodeee> stack = new Stack<>();
        Nodeee current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();
            System.out.print(current.val + " ");
            current = current.right;
        }
    }

    private static void postOrder(Nodeee root) {
        if (root == null) return;

        Stack<Nodeee> stack1 = new Stack<>();
        Stack<Nodeee> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.isEmpty()) {
            Nodeee node = stack1.pop();
            stack2.push(node);

            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().val + " ");
        }
    }
}
