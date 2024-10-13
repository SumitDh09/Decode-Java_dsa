package Recursion.RecursionPartII;

public class PassingNumber {
    public static void main(String[] args) {
        fed(5);
    }
    static void fed(int n){
        if (n==0){
            return;

        }
        System.out.println(n);
        fed(--n);
    }
}
