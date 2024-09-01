package QueSOlve;

import java.util.Scanner;

public class Squarepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value's:-");
        int n =sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print((i+j)-1+" ");

            }
            System.out.println();

        }


    }
}
