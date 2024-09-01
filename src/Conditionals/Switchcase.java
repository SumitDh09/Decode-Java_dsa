package Conditionals;


import java.util.Scanner;

public class Switchcase {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int result;
        switch (op) {
            case '*':
                result = a * b;
                break;
            case '+':
                result = a + b;
                break;
            case ',':
            case '.':
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
                return;
            case '-':
                result = a - b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }

                result = a / b;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
