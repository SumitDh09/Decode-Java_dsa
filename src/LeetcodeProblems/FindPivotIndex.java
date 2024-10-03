package LeetcodeProblems;

public class FindPivotIndex {
    public static void main(String[] args) {
        FindPivotIndex pi = new FindPivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        int result = pi.pivotIndex(nums);
        System.out.println("Pivot index: " + result);
    }

    public int pivotIndex(int[] a) {
        // Calculate the total sum of the array
        int totalSum = 0;
        for (int num : a) {
            totalSum += num;
        }

        // Initialize left sum
        int leftSum = 0;

        // Iterate through the array
        for (int i = 0; i < a.length; i++) {
            // Check if left sum equals right sum
            if (leftSum == totalSum - leftSum - a[i]) {
                return i; // Found pivot index
            }

            // Update left sum for next iteration
            leftSum += a[i];
        }

        // No pivot index found
        return -1;
    }
}

