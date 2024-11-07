package LeetcodeProblems;

public class FindPeakElement {
    public static void main(String[] args) {
        FindPeakElement obj = new FindPeakElement();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Peak element index for nums1: " + obj.findPeakElement(nums1)); // Expected output: 2
        System.out.println("Peak element index for nums2: " + obj.findPeakElement(nums2)); // Expected output: 1 or 5
    }

    public int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

