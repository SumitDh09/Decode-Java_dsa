package LeetcodeProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurences {
    public static void main(String[] args) {
        UniqueOccurences obj = new UniqueOccurences();
        int[] arr1 = {1, 2, 2, 1, 1, 3};
        int[] arr2 = {1, 2};
        int[] arr3 = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};

        System.out.println("Unique occurrences for arr1: " + obj.uniqueOccurrences(arr1)); // Expected output: true
        System.out.println("Unique occurrences for arr2: " + obj.uniqueOccurrences(arr2)); // Expected output: false
        System.out.println("Unique occurrences for arr3: " + obj.uniqueOccurrences(arr3)); // Expected output: true
    }

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        Set<Integer> occurrences = new HashSet<>(countMap.values());
        return occurrences.size() == countMap.size();
    }
}

