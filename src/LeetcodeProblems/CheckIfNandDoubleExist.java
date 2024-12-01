package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandDoubleExist {
    public static void main(String[] args) {
        CheckIfNandDoubleExist solution = new CheckIfNandDoubleExist();

        int[] arr1 = {10, 2, 5, 3};
        System.out.println("Check if there exist two indices: " + solution.checkIfExist(arr1));
        // Expected output: true

        int[] arr2 = {3, 1, 7, 11};
        System.out.println("Check if there exist two indices: " + solution.checkIfExist(arr2));
        // Expected output: false

        int[] arr3 = {1, 2, 4, 8};
        System.out.println("Check if there exist two indices: " + solution.checkIfExist(arr3));
        // Expected output: true
    }

    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (seen.contains(2 * num) || (num % 2 == 0 && seen.contains(num / 2))) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}

