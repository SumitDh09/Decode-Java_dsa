package LeetcodeProblems;

import java.util.Arrays;
import java.util.TreeMap;

public class MostBeautifulItemForEachQuery {
    public static void main(String[] args) {
        MostBeautifulItemForEachQuery obj = new MostBeautifulItemForEachQuery();
        int[][] items1 = {{1, 2}, {3, 2}, {2, 4}, {5, 6}, {3, 5}};
        int[] queries1 = {1, 2, 3, 4, 5, 6};
        System.out.println("Maximum beauty for queries1: " + Arrays.toString(obj.maximumBeauty(items1, queries1))); // Expected output: [2, 4, 5, 5, 6, 6]

        int[][] items2 = {{1, 2}, {1, 2}, {1, 3}, {1, 4}};
        int[] queries2 = {1};
        System.out.println("Maximum beauty for queries2: " + Arrays.toString(obj.maximumBeauty(items2, queries2))); // Expected output: [4]

        int[][] items3 = {{10, 1000}};
        int[] queries3 = {5};
        System.out.println("Maximum beauty for queries3: " + Arrays.toString(obj.maximumBeauty(items3, queries3))); // Expected output: [0]
    }

    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Sort items by price
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        // TreeMap to store the maximum beauty for each price
        TreeMap<Integer, Integer> priceToBeauty = new TreeMap<>();
        int maxBeauty = 0;

        // Populate the TreeMap with the maximum beauty for each price
        for (int[] item : items) {
            maxBeauty = Math.max(maxBeauty, item[1]);
            priceToBeauty.put(item[0], maxBeauty);
        }

        // Array to store the results
        int[] result = new int[queries.length];

        // For each query, find the maximum beauty for the given price
        for (int i = 0; i < queries.length; i++) {
            Integer key = priceToBeauty.floorKey(queries[i]);
            result[i] = (key == null) ? 0 : priceToBeauty.get(key);
        }

        return result;
    }
}

