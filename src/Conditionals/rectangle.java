package Conditionals;

import java.util.Scanner;

public class rectangle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length :");
        double d = sc.nextDouble();
        System.out.println("enter the breadth");
        double c = sc.nextDouble();
        double area = d * c;
        double perimeter = 2.0 * (d + c);
        System.out.println("Area of a rectangle :" + area);
        sc.close();
    }
}
