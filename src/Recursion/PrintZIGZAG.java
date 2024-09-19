package Recursion;

public class PrintZIGZAG {
    public static void sip(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        sip(n-1);
        System.out.println(n);
        sip(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        sip(3);
        //sip(1);
        //sip(4);


    }
}
