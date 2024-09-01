package MultiDimensionalArray2;

public class WavePrint2 {
    public static void print(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        int j;
        int i;
        for(j = 0; j < m; ++j) {
            for(i = 0; i < m; ++i) {
                System.out.print(arr[j][i] + " ");
            }

            System.out.println();
        }

        System.out.println();

        for(j = 0; j < n; ++j) {
            if (j % 2 == 0) {
                for(i = 0; i < m; ++i) {
                    System.out.print(arr[j][i] + " ");
                }
            } else {
                for(i = m - 1; i >= 0; --i) {
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

