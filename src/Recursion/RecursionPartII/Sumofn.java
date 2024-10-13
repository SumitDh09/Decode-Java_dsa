package Recursion.RecursionPartII;

public class Sumofn {
    public static void main(String[] args) {
        int anss = sum(5);
        System.out.println(anss);
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;

        }
        return n+sum(n-1);

    }
}

