package LeetcodeProblems;

import java.util.*;

public class CombinationSumIII {
    public static void main(String[] args) {
        CombinationSumIII solution = new CombinationSumIII();
        System.out.println(solution.combinationSum3(3, 7)); // Output: [[1, 2, 4]]
        System.out.println(solution.combinationSum3(3, 9)); // Output: [[1, 2, 6], [1, 3, 5], [2, 3, 4]]
        System.out.println(solution.combinationSum3(4, 1)); // Output: []
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> combination, int k, int n, int start) {
        if (combination.size() == k && n == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (combination.size() >= k || n < 0) {
            return;
        }
        for (int i = start; i <= 9; i++) {
            combination.add(i);
            backtrack(result, combination, k, n - i, i + 1);
            combination.remove(combination.size() - 1);
        }
    }
}
