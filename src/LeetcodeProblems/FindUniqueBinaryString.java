package LeetcodeProblems;
import java.util.*;

class FindUniqueBinaryString {
    public static void main(String[] args) {
        FindUniqueBinaryString solution = new FindUniqueBinaryString();
        String[] nums = {"01", "10", "00"};
        String result = solution.findDifferentBinaryString(nums);
        System.out.println("Different Binary String: " + result);
    }

    public String findDifferentBinaryString(String[] nums) {
        return findDifferentBinaryString(nums, 0);
    }

    private String findDifferentBinaryString(String[] nums, int index) {
        if (index == nums.length) {
            return "";
        }

        char bit = nums[index].charAt(index) == '0' ? '1' : '0';
        return bit + findDifferentBinaryString(nums, index + 1);
    }
}
