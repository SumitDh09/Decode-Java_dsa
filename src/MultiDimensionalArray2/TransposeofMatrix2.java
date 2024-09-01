package MultiDimensionalArray2;

public class TransposeofMatrix2 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2}, {5, 6}, {9, 8}};
        int m = arr.length;
        int n = arr[0].length;

        int j;
        int i;
        for(j = 0; j < m; ++j) {
            for(i = 0; i < n; ++i) {
            }
        }

        for(j = 0; j < n; ++j) {
            for(i = 0; i < m; ++i) {
                System.out.println(arr[i][j] + " ");
            }
        }

        System.out.println();
    }
}

