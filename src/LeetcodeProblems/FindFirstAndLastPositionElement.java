package LeetcodeProblems;

class FindFirstAndLastPositionElement {
    public static void main(String[] args) {
        FindFirstAndLastPositionElement obj = new FindFirstAndLastPositionElement();
        int[] arr1 = {5, 7, 7, 8, 8, 10};
        int target1 = 8;
        int[] result1 = obj.searchRange(arr1, target1);
        System.out.println("First and last position of " + target1 + " in arr1: [" + result1[0] + ", " + result1[1] + "]"); // Expected output: [3, 4]

        int[] arr2 = {5, 7, 7, 8, 8, 10};
        int target2 = 6;
        int[] result2 = obj.searchRange(arr2, target2);
        System.out.println("First and last position of " + target2 + " in arr2: [" + result2[0] + ", " + result2[1] + "]"); // Expected output: [-1, -1]

        int[] arr3 = {};
        int target3 = 0;
        int[] result3 = obj.searchRange(arr3, target3);
        System.out.println("First and last position of " + target3 + " in arr3: [" + result3[0] + ", " + result3[1] + "]"); // Expected output: [-1, -1]
    }

    public int[] searchRange(int[] arr, int target) {
        int[] ans = { -1, -1 };
        int n = arr.length;
        boolean flag = false;
        int lo = 0;
        int hi = n - 1;

        // Find if the target available in the array
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        if (!flag) return ans;

        // Find the lower bound
        lo = 0;
        hi = n - 1;
        int lb = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                lb = Math.min(lb, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        ans[0] = lb;

        // Find the upper bound
        int ub = n;
        lo = 0;
        hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                ub = Math.min(ub, mid);
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        ans[1] = ub - 1;

        return ans;
    }
}
