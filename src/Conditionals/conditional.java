package Conditionals;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("even");
        }

        if (n % 2 == 1) {
            System.out.println("odd");
        }

        sc.close();
    }
}
