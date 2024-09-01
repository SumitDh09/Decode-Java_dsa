package MultiDimensionalArray2;

public class TransposeinNnewmatrix {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2}, {5, 6}, {9, 8}};
        int m = arr.length;
        int n = arr[0].length;
        System.out.println();
        int[][] transpose = new int[n][m];

        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                transpose[i][j] = arr[j][i];
                System.out.println(transpose[i][j] + " ");
            }
        }

        System.out.println();
    }
}
