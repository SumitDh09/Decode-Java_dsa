package MultiDimensionalArray2;

public class Spiralmatrix {
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
        int[][] arr = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};
        int m = arr.length;
        int n = arr[0].length;
        print(arr);
        int minr = 0;
        int maxr = m - 1;
        int minc = 0;
        int maxc = n - 1;

        while(minr <= maxr && minc <= maxc) {
            int i;
            for(i = minc; i <= maxc; ++i) {
                System.out.print(arr[minr][i] + " ");
            }

            ++minr;

            for(i = minr; i <= maxr; ++i) {
                System.out.print(arr[i][maxc] + " ");
            }

            --maxc;
            if (minr <= maxr) {
                for(i = maxc; i >= minc; --i) {
                    System.out.print(arr[maxr][i] + " ");
                }

                --maxr;
            }

            if (minc <= maxc) {
                for(i = maxr; i >= minr; --i) {
                    System.out.print(arr[i][minc] + " ");
                }

                ++minc;
            }
        }

    }
}

