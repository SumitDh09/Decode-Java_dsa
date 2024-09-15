package Recursion;

import java.util.Scanner;

public class Print1toNafterRecursivecall {
    public static void print(int n){
        if (n == 0) // this is base case
            return;
//      System.out.println(n); // work
        print(n-1); // call
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}
