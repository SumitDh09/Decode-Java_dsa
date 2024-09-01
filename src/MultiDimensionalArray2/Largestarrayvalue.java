package MultiDimensionalArray2;

public class Largestarrayvalue {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 2, 4}, {5, -9, 3}, {5, 10, 3}};
        int mx = Integer.MIN_VALUE;
        int m = arr.length;
        int n = arr[0].length;

        for(int i = 0; i < m; ++i) {
            for(int j = 0; j < n; ++j) {
                mx = Math.max(mx, arr[i][j]);
            }
        }

        System.out.println(mx);
    }
}
