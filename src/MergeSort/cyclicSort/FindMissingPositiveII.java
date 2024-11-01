package MergeSort.cyclicSort;

public class FindMissingPositiveII {
    public static void main(String[] args) {
        FindMissingPositiveII obj = new FindMissingPositiveII();
        int[] nums1 = {3, 4, -1, 1};
        int[] nums2 = {1, 2, 0};

        System.out.println("First missing positive number in nums1: " + obj.firstMissingNumber(nums1)); // Expected output: 2
        System.out.println("First missing positive number in nums2: " + obj.firstMissingNumber(nums2)); // Expected output: 3
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int firstMissingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            int ele = nums[i];
            if (ele <= 0 || ele == i + 1 || ele > n || ele == nums[ele - 1]) {
                i++;
            } else {
                swap(i, ele - 1, nums);
            }
        }
        for (i = 0; i < n; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return i + 1;
    }
}