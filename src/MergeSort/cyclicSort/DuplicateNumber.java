package MergeSort.cyclicSort;

public class DuplicateNumber {
    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int findDuplicate(int[] nums) {
        while (true) {
            int ele = nums[0];
            if (nums[ele] == ele)
                return ele;
            swap(0, ele, nums);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {2, 1, 3, 4, 2}; // Replace with your own array
        DuplicateNumber duplicateFinder = new DuplicateNumber();
        int duplicate = duplicateFinder.findDuplicate(arr);
        System.out.println("Duplicate number: " + duplicate);
    }
}
