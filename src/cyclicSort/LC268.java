package cyclicSort;
class LC268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        LC268 solution = new LC268();
        int[] nums = {3, 0, 1}; // example input
        int result = solution.missingNumber(nums);
        System.out.println("The missing number is: " + result);
    }
}
