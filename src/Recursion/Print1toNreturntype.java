package Recursion;

import java.util.Scanner;

public class Print1toNreturntype {
    public static int sum(int n ){
        if(n==1 || n==0)
            return n;// base case
        return  n+sum(n-1); //call

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter n number :-");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}
