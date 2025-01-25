package LeetcodeProblems;

import java.util.*;

public class LexicographicallySmallestArray {
    public static void main(String[] args) {
        LexicographicallySmallestArray solution = new LexicographicallySmallestArray();
        int[] arr = {1, 5, 3, 9, 8};
        int threshold = 2;
        int[] result = solution.lexicographicallySmallestArray(arr, threshold);
        System.out.println(Arrays.toString(result));
    }

    public int[] lexicographicallySmallestArray(int[] arr, int threshold) {
        List<Pair> valueIndexPairs = new ArrayList<>();
        int size = arr.length;

        for (int i = 0; i < size; ++i) {
            valueIndexPairs.add(new Pair(arr[i], i));
        }

        Collections.sort(valueIndexPairs);

        List<List<Pair>> groupedPairs = new ArrayList<>();
        groupedPairs.add(new ArrayList<>(Arrays.asList(valueIndexPairs.get(0))));

        for (int i = 1; i < size; ++i) {
            if (valueIndexPairs.get(i).value - valueIndexPairs.get(i - 1).value <= threshold) {
                groupedPairs.get(groupedPairs.size() - 1).add(valueIndexPairs.get(i));
            } else {
                groupedPairs.add(new ArrayList<>(Arrays.asList(valueIndexPairs.get(i))));
            }
        }

        for (List<Pair> group : groupedPairs) {
            List<Integer> indices = new ArrayList<>();
            for (Pair pair : group) {
                indices.add(pair.index);
            }

            Collections.sort(indices);

            for (int i = 0; i < indices.size(); ++i) {
                arr[indices.get(i)] = group.get(i).value;
            }
        }

        return arr;
    }

    static class Pair implements Comparable<Pair> {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.value, other.value);
        }
    }
}

