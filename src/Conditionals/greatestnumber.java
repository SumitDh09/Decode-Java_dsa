package Conditionals;



import java.util.Scanner;

public class greatestnumber {
    public greatestnumber() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a greatest number :");
        int a = sc.nextInt();
        System.out.println("enter 2nd greatest number :");
        int b = sc.nextInt();
        System.out.println("enter 3rd greatest number :");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greatest number ");
        }

        if (b > a && b > c) {
            System.out.println("b is greatest number :");
        }

        if (c > a && c > b) {
            System.out.println(" c is greatest number :");
        }

        sc.close();
    }
}

