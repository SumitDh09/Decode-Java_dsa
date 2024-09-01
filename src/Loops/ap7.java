package Loops;

import java.util.Scanner;

public class ap7 {
    public ap7() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 7; i <= 7 * n - 1; i += 7) {
            System.out.println(i);
        }

    }
}
