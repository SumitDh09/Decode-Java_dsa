package LeetcodeProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class FindUniqueBinaryString {
    public static void main(String[] args) {
        FindUniqueBinaryString solution = new FindUniqueBinaryString();
        String[] nums = {"01", "10", "00"};
        String result = solution.findDifferentBinaryString(nums);
        System.out.println("Different Binary String: " + result);
    }

    public String findDifferentBinaryString(String[] nums) {
        Set<String> set = new HashSet<>(Arrays.asList(nums));
        return findDifferentBinaryString(set, nums[0].length(), new char[nums[0].length()], 0);
    }

    private String findDifferentBinaryString(Set<String> set, int n, char[] candidate, int index) {
        if (index == n) {
            return new String(candidate);
        }

        for (char c = '0'; c <= '1'; c++) {
            candidate[index] = c;
            String candidateStr = new String(candidate);
            if (!set.contains(candidateStr)) {
                String result = findDifferentBinaryString(set, n, candidate, index + 1);
                if (result != null) {
                    return result;
                }
            }
        }
        return null;
    }
}
