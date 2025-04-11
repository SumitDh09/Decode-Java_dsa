package LeetcodeProblems;

import java.util.*;

class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] cums1 = {1, 2, 3, 1};
        System.out.println("Test case 1: " + containsDuplicate.containsDuplicate(cums1));

        int[] cums2 = {1, 2, 3, 4};
        System.out.println("Test case 2: " + containsDuplicate.containsDuplicate(cums2));

        int[] cums3 = {};
        System.out.println("Test case 3: " + containsDuplicate.containsDuplicate(cums3));

        int[] cums4 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Test case 4: " + containsDuplicate.containsDuplicate(cums4));
    }

    public boolean containsDuplicate(int[] cums) {
        Arrays.sort(cums);
        int n = cums.length;
        for (int i = 1; i < n; i++) {
            if (cums[i] == cums[i - 1])
                return true;
        }
        return false;
    }
}