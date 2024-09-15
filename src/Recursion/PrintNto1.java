package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void print(int n){
        if (n == 0) // this is base case
            return;
        System.out.println(n); // work
        print(n-1); // call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}
