package MultiDimensionalArray2;

public class Addtwomatrix {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 9, 2}, {2, 5, 4}, {9, 5, 7}};
        int[][] b = new int[][]{{1, 2, 4}, {5, -9, 3}, {5, 10, 3}};
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];

        int i;
        int j;
        for(i = 0; i < m; ++i) {
            for(j = 0; j < n; ++j) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }

        for(i = 0; i < m; ++i) {
            for(j = 0; j < n; ++j) {
                System.out.print(res[i][j] + " ");
            }

            System.out.println();
        }

    }
}

