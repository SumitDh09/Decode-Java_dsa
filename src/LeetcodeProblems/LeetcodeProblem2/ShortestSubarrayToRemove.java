package LeetcodeProblems.ModuleLeetcode.LeetcodeProblem2;

public class ShortestSubarrayToRemove {
    public static void main(String[] args) {
        ShortestSubarrayToRemove obj = new ShortestSubarrayToRemove();
        int[] arr1 = {1, 2, 3, 10, 4, 2, 3, 5};
        System.out.println("Length of shortest subarray to remove for arr 1: " + obj.findLengthOfShortestSubarray(arr1)); // Expected output: 3

        int[] arr2 = {5, 4, 3, 2, 1};
        System.out.println("Length of shortest subarray to remove for arr 2: " + obj.findLengthOfShortestSubarray(arr2)); // Expected output: 4

        int[] arr3 = {1, 2, 3};
        System.out.println("Length of shortest subarray to remove for arr 3: " + obj.findLengthOfShortestSubarray(arr3)); // Expected output: 0
    }

    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        // Find the longest non-decreasing subarray from the start
        while (left < n - 1 && arr[left] <= arr[left + 1]) {
            left++;
        }

        // If the entire array is non-decreasing
        if (left == n - 1) {
            return 0;
        }

        // Find the longest non-decreasing subarray from the end
        while (right > 0 && arr[right] >= arr[right - 1]) {
            right--;
        }

        // Calculate the minimum length to remove
        int minLength = Math.min(n - left - 1, right);

        // Try to merge the two non-decreasing parts
        int i = 0;
        int j = right;
        while (i <= left && j < n) {
            if (arr[i] <= arr[j]) {
                minLength = Math.min(minLength, j - i - 1);
                i++;
            } else {
                j++;
            }
        }

        return minLength;
    }
}