package PatternPrinting;

public class printNumberIncreasingPyramid {

    public static void printNumberIncreasingPyramid(int n) {
        int i;
        for(i = 1; i <= n; ++i) {
            for(int j = 1; j <= i; ++j) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        for(i = 1; i <= n; ++i) {
            char ch = 'A';

            for(int j = 1; j <= i; ++j) {
                System.out.print(ch + " ");
                ++ch;
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 6;
        printNumberIncreasingPyramid(n);
    }
}

