package QueSOlve;

public class SeriesGenerator {
    public static void main(String[] args) {
        int n = 5; // Number of terms in the series
        for (int i = 0; i < n; i++) {
            int term = (1 << (i + 1)) - 1;
            System.out.print(term + " ");
        }
    }
}
