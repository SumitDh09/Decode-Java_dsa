package Recursion.RecursionPartII;

public class SumofDigits {
    public static void main(String[] args) {
        int anr = digit(1342);
        System.out.println(anr);

    }
    static int digit(int n){
       if (n==0){
//        if (n%10==n){
            return 0;
        }
        return(n%10) + digit(n/10);

    }
}
