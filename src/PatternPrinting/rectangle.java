package PatternPrinting;

import java.util.Scanner;

public class rectangle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        System.out.println("Enter the number of coloums :");
        int n = sc.nextInt();
        int m = sc.nextInt();

        for(int i = 1; i <= 3; ++i) {
            for(int j = 1; j <= 7; ++j) {
                System.out.print(" * ");
            }

            System.out.println();
            sc.close();
        }

    }
}
