package PatternPrinting;

import java.util.Scanner;

public class Smallalpha {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows and coloumn :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n; ++j) {
                System.out.print((char)(j + 96) + " ");
            }

            System.out.println(" ");
        }

    }
}


