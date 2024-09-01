package Conditionals;
import java.util.Scanner;

public class operator {
    public operator() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if (n > 99 && n < 1000) {
            System.out.println("three digit number :");
        } else {
            System.out.println("not a three digit number :");
        }

        sc.close();
    }
}
