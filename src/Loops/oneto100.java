package Loops;
import java.util.Scanner;

public class oneto100 {

    public static void main(String[] args) {
        new Scanner(System.in);

        for(int i = 1; i <= 100; ++i) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }

    }
}
