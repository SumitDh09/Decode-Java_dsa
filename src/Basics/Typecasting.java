package Basics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y = sc.nextDouble();
        int x = (int)y;
        System.out.println(x);
        sc.close();
    }
}
