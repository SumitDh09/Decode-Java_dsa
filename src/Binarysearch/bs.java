package Binarysearch;

public class bs {
    public static void main(String[] args) {
        int[] arr = {10, 23, 46, 54, 65, 91, 97, 105, 154, 264};
        int n = arr.length;
        int target = 91;
        int low = 0;
        int high = n - 1;
        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (flag) {
            System.out.println("Target present");
        } else {
            System.out.println("Target not found");
        }
    }
}
