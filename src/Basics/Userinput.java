package Basics;


import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius of circle :");
        double r = sc.nextDouble();
        double a = 3.1415 * r * r;
        System.out.println(a);
        sc.close();
    }
}

