package Conditionals;

import java.util.Scanner;
public class costandselling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price :");
        int cp = sc.nextInt();
        System.out.println("enter the selling price :");
        int sp = sc.nextInt();
        if (sp > cp) {
            System.out.println("profit");
        } else {
            System.out.println("loss");
        }

        if (cp == sp) {
            System.out.println("no profit no loss");
        }

        sc.close();
    }
}

