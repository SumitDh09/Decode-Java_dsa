package PatternPrinting;


import java.util.Scanner;

public class numberofsq{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n; ++j) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}

