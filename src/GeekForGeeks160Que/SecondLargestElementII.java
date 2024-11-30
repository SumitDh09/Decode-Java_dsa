package GeekForGeeks160Que;

import java.util.Arrays;

class SecondLargestElementII {
    public static void main(String[] args) {
        SecondLargestElementII solution = new SecondLargestElementII();

        int[] arr1 = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Second Largest Element: " + solution.getSecondLargest(arr1)); // Expected output: 4

        int[] arr2 = {10, 20, 30};
        System.out.println("Second Largest Element: " + solution.getSecondLargest(arr2)); // Expected output: 20

        int[] arr3 = {0, 0};
        System.out.println("Second Largest Element: " + solution.getSecondLargest(arr3)); // Expected output: -1
    }

    public int getSecondLargest(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n - 1];
        for (int i = n - 1; i >= 0; i--) {
            if (max > nums[i]) {
                return nums[i];
            }
        }
        return -1;
    }
}
