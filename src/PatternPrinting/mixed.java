package PatternPrinting;

import java.util.Scanner;

public class mixed {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            int k;
            for(k = n; k > i; --k) {
                System.out.print(" ");
            }

            for(k = 0; k < i; ++k) {
                System.out.print((char)(65 + k) + " ");
            }

            System.out.println();
        }

    }
}
