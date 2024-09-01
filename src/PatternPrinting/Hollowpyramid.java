package PatternPrinting;

public class Hollowpyramid {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print characters
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == rows) {
                    // Print stars on the border and base of the pyramid
                    System.out.print("*");
                } else {
                    // Print spaces inside the pyramid
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
