package Recursion.RecursionPartII;

public class reverse1toN {
    public static void main(String[] args) {
        funrev(5);
    }
    static void funrev(int n){
        if (n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
}
