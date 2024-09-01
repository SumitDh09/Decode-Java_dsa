package module10;


import java.util.Scanner;

public class ABCtriangle {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows ");
        int rows = sc.nextInt();

        for(int i = rows; i >= 1; --i) {
            for(int j = rows; j >= i; --j) {
                System.out.print((char)(j + 64) + " ");
            }

            System.out.println();
            sc.close();
        }

    }
}
