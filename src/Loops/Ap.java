package Loops;
import java.util.Scanner;

public class Ap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n - 1; i += 2) {
            System.out.println(i);
        }

    }
}