package Conditionals;

import java.util.Scanner;

public class ternary {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number :");
            int n = sc.nextInt();
            System.out.println(n % 2 == 0 ? "Even" : "odd");
        }
    }

