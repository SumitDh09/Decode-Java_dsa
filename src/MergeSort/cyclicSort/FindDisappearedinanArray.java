package MergeSort.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedinanArray {
    public static void main(String[] args) {
        FindDisappearedinanArray solution = new FindDisappearedinanArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // example input
        List<Integer> result = solution.findDisappearedNumbers(nums);
        System.out.println("The disappeared numbers are: " + result);
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int ele = nums[i];
            // ele should be at ele-1 index
            if (ele > 0 && ele <= n && nums[i] != nums[ele - 1]) {
                swap(i, ele - 1, nums);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                ans.add(i + 1);
            }
        }
        return ans;
    }
}
