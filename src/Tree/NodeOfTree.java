package Tree;


class Node{
    int val;
   Nodeee left;
    Nodeee right;
    Node(int val){
        this.val = val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
       Nodeee a = new Nodeee(1);
        Nodeee b = new Nodeee(2);
        Nodeee c = new Nodeee(3);
        Nodeee d = new Nodeee(4);
        Nodeee e = new Nodeee(5);
        Nodeee f = new Nodeee(6);

        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        a.left.right.val=19;
        System.out.println(c.val);
        System.out.println(a.left.right.val);
    }
}
