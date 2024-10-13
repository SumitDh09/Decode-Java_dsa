package PatternPrinting;

public class next {
    public static void main(String[] args) {
        int n = 5;

        // Loop for each row
        for (int i = 1; i <= n; i++) {

            // Loop for spaces before stars in each row
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Loop for stars in each row
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // New line after each row
            System.out.println();
        }
    }
}
