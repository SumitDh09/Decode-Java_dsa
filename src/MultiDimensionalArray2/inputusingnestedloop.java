package MultiDimensionalArray2;

import java.util.Scanner;

public class inputusingnestedloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][3];

        int i;
        int j;
        for(i = 0; i < 2; ++i) {
            for(j = 0; j < 3; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < 2; ++i) {
            for(j = 0; j < 3; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }
}
