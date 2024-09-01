package Loops;


import java.util.Scanner;

public class compositenumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("check the enter number is composite or not :");
        int n = sc.nextInt();

        for(int i = 2; i <= n - 1; ++i) {
            if (n % i == 0) {
                System.out.println("composite number :");
                break;
            }
        }

    }
}