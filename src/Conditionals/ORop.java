package Conditionals;


import java.util.Scanner;

public class ORop {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();
        if (n % 5 != 0 && n % 3 != 0) {
            System.out.println("not divisible by 5 0r 3 :");
        } else {
            System.out.println("divisible by 5 or 3  :");
        }

        sc.close();
    }
}
