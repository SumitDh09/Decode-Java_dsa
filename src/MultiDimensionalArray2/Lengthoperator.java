package MultiDimensionalArray2;
import java.util.Scanner;
public class Lengthoperator {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[][] arr = new int[2][3];
            int m = arr.length;
            int n = arr.length;
            System.out.println(n);

            int i;
            int j;
            for(i = 0; i < m; ++i) {
                for(j = 0; j < n; ++j) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for(i = 0; i < m; ++i) {
                for(j = 0; j < n; ++j) {
                    System.out.print(arr[i][j] + " ");
                }

                System.out.println();
            }

    }


}
