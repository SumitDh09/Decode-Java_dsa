package QueSOlve;

import java.util.ArrayList;
import java.util.List;

public class IncreasingSequencesM2 {
    static List<List<Integer>> result = new ArrayList<>();

    public static void generateSequences(int n, int k, int index, List<Integer> current) {
        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include the current element
        for (int i = index + 1; i <= n; i++) {
            current.add(i);
            generateSequences(n, k, i, current);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5; // First n natural numbers
        int k = 3; // Length of sequences
        generateSequences(n, k, 0, new ArrayList<>());

        // Print the result
        for (List<Integer> seq : result) {
            System.out.println(seq);
        }
    }
}
