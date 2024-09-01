package Conditionals;


import java.util.Scanner;

public class triangle {
    public triangle() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st side of triangle :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd side of triangle :");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd side of triangle :");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("valid triangle :");
        } else {
            System.out.println("not a valid triangle :");
        }

    }
}
