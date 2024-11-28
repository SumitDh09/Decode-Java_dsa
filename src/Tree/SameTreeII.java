package Tree;

class TreEnode {
    int val;
    TreEnode left;
    TreEnode right;
    TreEnode(int val) {
        this.val = val;
    }
}

public class SameTreeII {
    public static void main(String[] args) {
        SameTreeII solution = new SameTreeII();

        TreEnode p = new TreEnode(1);
        p.left = new TreEnode(2);
        p.right = new TreEnode(3);

        TreEnode q = new TreEnode(1);
        q.left = new TreEnode(2);
        q.right = new TreEnode(3);

        System.out.println("Are the trees the same? " + solution.isSameTree(p, q)); // Expected output: true

        TreEnode r = new TreEnode(1);
        r.left = new TreEnode(2);

        TreEnode s = new TreEnode(1);
        s.right = new TreEnode(2);

        System.out.println("Are the trees the same? " + solution.isSameTree(r, s)); // Expected output: false
    }

    public boolean isSameTree(TreEnode p, TreEnode q) {
        if (p == null && q == null)
            return true;
        if (p == null && q != null)
            return false;
        if (p != null && q == null)
            return false;
        if (p.val != q.val)
            return false;
        if (!isSameTree(p.left, q.left))
            return false;
        if (!isSameTree(p.right, q.right))
            return false;
        return true;
    }
}

