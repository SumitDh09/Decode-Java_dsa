package Recursion;

import java.util.Scanner;

public class Print1toNParameterised {
    public static void sum(int n, int s) {
            if (n==0){ // base cases are bigger than the call
                System.out.println(s);
                return;
            }
            sum(n-1 , s+n); //call& work together
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        sum(n, 0);
    }
}
