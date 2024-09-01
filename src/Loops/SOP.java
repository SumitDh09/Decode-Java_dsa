package Loops;

import java.util.Scanner;

public class SOP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();
        int sum = 0;

        int on;
        for(on = n; n != 0; n /= 10) {
            int digit = n % 10;
            sum += digit;
        }

        System.out.println("Sop" + on + " = " + sum);
    }
}
