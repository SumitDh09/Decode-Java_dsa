package LeetcodeProblems;

import java.util.HashSet;
import java.util.Set;

public class FindThePrefixCommonArray {
    public static void main(String[] args) {
        FindThePrefixCommonArray solution = new FindThePrefixCommonArray();
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        int[] result = solution.findThePrefixCommonArray(A, B);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();

        for (int i = 0; i < n; i++) {
            setA.add(A[i]);
            setB.add(B[i]);
            int commonCount = 0;
            for (int num : setA) {
                if (setB.contains(num)) {
                    commonCount++;
                }
            }
            C[i] = commonCount;
        }

        return C;
    }
}
