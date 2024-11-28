package Tree;

class Treenode {
        int val;
        Treenode left;
        Treenode right;
        Treenode(int val) {
            this.val = val;
        }
    }

public class SameTree {
    public static void main(String[] args) {
        SameTree solution = new SameTree();

        Treenode p = new Treenode(1);
        p.left = new Treenode(2);
        p.right = new Treenode(3);

        Treenode q = new Treenode(1);
        q.left = new Treenode(2);
        q.right = new Treenode(3);

        System.out.println("Are the trees the same? " + solution.isSameTree(p, q)); // Expected output: true

        Treenode r = new Treenode(1);
        r.left = new Treenode(2);

        Treenode s = new Treenode(1);
        s.right = new Treenode(2);

        System.out.println("Are the trees the same? " + solution.isSameTree(r, s)); // Expected output: false
    }

    public boolean isSameTree(Treenode p, Treenode q) {
        if (p == null || q == null)
            return p == q;
        return p.val == q.val &&
                isSameTree(p.left, q.left) &&
                isSameTree(p.right, q.right);
    }

}

