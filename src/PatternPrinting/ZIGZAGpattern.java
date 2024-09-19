package PatternPrinting;

import java.util.Scanner;

public class ZIGZAGpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        printZigzagPattern(n);
    }

    public static void printZigzagPattern(int n) {
        int var1, var = 1;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                var = var + i - 1;
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        System.out.print(var);
                    } else {
                        System.out.print(" " + var);
                    }
                    var++;
                }
            } else {
                var1 = var + i - 1;
                for (int j = 1; j <= i; j++) {
                    if (j == 1) {
                        System.out.print(var1);
                    } else {
                        System.out.print(" " + var1);
                    }
                    var1--;
                }
            }
            System.out.println();
        }
    }
}
