package MultiDimensionalArray2;


import java.util.Scanner;

public class Studentresult {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][2];

        int i;
        int j;
        for(i = 0; i < 4; ++i) {
            for(j = 0; j < 2; ++j) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(i = 0; i < 4; ++i) {
            for(j = 0; j < 2; ++j) {
                System.out.print(arr[i][j] + " ");
            }
        }

        System.out.println();
    }
}

