package cyclicSort;
public class missingnumber {
    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == i) {
                i++;
            } else {
                swap(i, nums[i], nums);
            }
        }
        return i;
    }

    public static void main(String[] args) {
        missingnumber solution = new missingnumber(); // declare the instance with a variable name
        int[] nums = {3, 0, 1}; // example input
        int result = solution.missingNumber(nums);
        System.out.println("The missing number is: " + result);
    }
}