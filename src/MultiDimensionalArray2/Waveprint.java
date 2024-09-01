package MultiDimensionalArray2;

public class Waveprint {
    public static void print(int[][] arr) {
        int m = arr.length;

        int i;
        int j;
        for(i = 0; i < m; ++i) {
            for(j = 0; j < m; ++j) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println();

        for(i = 0; i < m; ++i) {
            if (i % 2 == 0) {
                for(j = 0; j < m; ++j) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for(j = m - 1; j >= 0; --j) {
                    System.out.print(arr[j][i] + " ");
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        print(arr);
    }
}

