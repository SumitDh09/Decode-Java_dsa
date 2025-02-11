package LeetcodeProblems;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int[] arr = {1, 2, 3};
        np.nextPermutation(arr);
        System.out.println(Arrays.toString(arr)); // Output: [1, 3, 2]
    }

    public void nextPermutation(int[] nums) {
        if (nums == null || nums.length <= 1) return;
        int i = nums.length - 2;

        // Find the first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) i--;

        if (i >= 0) {
            int j = nums.length - 1;

            // Find the element just larger than nums[i]
            while (nums[j] <= nums[i]) j--;

            // Swap the elements
            swap(nums, i, j);
        }

        // Reverse the elements after index i
        reverse(nums, i + 1, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}

