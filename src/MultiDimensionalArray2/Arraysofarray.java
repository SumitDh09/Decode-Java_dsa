package MultiDimensionalArray2;

public class Arraysofarray{
    public static void main(String[] args) {
        // 1D array example
        int[] oneDArray = new int[]{4, 7, 2, 0};
        System.out.println("1D Array elements:");
        for (int element : oneDArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 2D array example
        int[][] twoDArray = new int[][]{{1, 2, 3}, {5, 6, 4}};
        System.out.println("2D Array elements:");
        for (int[] row : twoDArray) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
