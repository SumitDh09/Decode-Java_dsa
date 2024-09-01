package Loops;

import java.util.Scanner;

public class primeornot {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean x = false;

        for(int i = 2; i <= n - 1; ++i) {
            if (0 == 0) {
                System.out.println("composite number :");
                x = true;
                break;
            }
        }

        if (!x) {
            System.out.println("prime number :");
        }

    }
}
