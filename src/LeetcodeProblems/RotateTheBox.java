package LeetcodeProblems;

public class RotateTheBox {
    public static void main(String[] args) {
        RotateTheBox obj = new RotateTheBox();
        char[][] box1 = {{'#', '.', '#'}};
        char[][] result1 = obj.rotateTheBox(box1);
        printMatrix(result1); // Expected output: [[.], [#], [#]]

        char[][] box2 = {{'#', '.', '*', '.'}, {'#', '#', '*', '.'}};
        char[][] result2 = obj.rotateTheBox(box2);
        printMatrix(result2); // Expected output: [[#,.], [#,#], [*,*], [.,.]]

        char[][] box3 = {{'#', '#', '*', '.', '*', '.'}, {'#', '#', '#', '*', '.', '.'}, {'#', '#', '#', '.', '#', '.'}};
        char[][] result3 = obj.rotateTheBox(box3);
        printMatrix(result3); // Expected output: [[.,#,#], [.,#,#], [#,#,*], [#,*,.], [#,.,*], [#,.,.]]

    }

    private static void printMatrix(char[][] matrix) {
        for (char[] row : matrix) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public char[][] rotateTheBox(char[][] box) {
        int m = box.length;
        int n = box[0].length;
        char[][] rotatedBox = new char[n][m];

        // Rotate the box 90 degrees clockwise
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotatedBox[j][m - 1 - i] = box[i][j];
            }
        }

        // Apply gravity to the stones in the rotated box
        for (int j = 0; j < n; j++) {
            int emptyRow = m - 1;
            for (int i = m - 1; i >= 0; i--) {
                if (rotatedBox[j][i] == '*') {
                    emptyRow = i - 1;
                } else if (rotatedBox[j][i] == '#') {
                    rotatedBox[j][i] = '.';
                    rotatedBox[j][emptyRow] = '#';
                    emptyRow--;
                }
            }
        }

        return rotatedBox;
    }
}
