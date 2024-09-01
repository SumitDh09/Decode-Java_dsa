package MultiDimensionalArray1;

public class mergesort {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        int k;
        for(k = m + n - 1; i >= 0 && j >= 0; --k) {
            if (nums1[i] >= nums2[j]) {
                nums1[k] = nums1[i];
                --i;
            } else {
                nums1[k] = nums2[j];
                --j;
            }
        }

        while(j >= 0) {
            nums1[k] = nums2[j];
            --j;
            --k;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.print("Merged array: ");
        int[] var5 = nums1;
        int var6 = nums1.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            int num = var5[var7];
            System.out.print(num + " ");
        }

    }
}
