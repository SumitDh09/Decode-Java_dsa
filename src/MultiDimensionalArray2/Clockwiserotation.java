package MultiDimensionalArray2;

public class Clockwiserotation {

    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(arr);
        int m = arr.length;

        int i;
        int a;
        int b;
        for(i = 0; i < m; ++i) {
            for(a = 0; a < i; ++a) {
                b = arr[i][a];
                arr[i][a] = arr[a][i];
                arr[a][i] = b;
            }
        }

        print(arr);

        for(i = 0; i < m; ++i) {
            a = 0;

            for(b = m - 1; a < b; --b) {
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                ++a;
            }
        }

        print(arr);
    }
}

