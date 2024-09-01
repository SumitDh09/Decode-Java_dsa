package ArrayAndArraylist;

import java.util.Arrays;

public class deepcopy {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 45, 2, 65, 95};
        int[] var2 = arr;
        int var3 = arr.length;

        int i;
        for(int var4 = 0; var4 < var3; ++var4) {
            i = var2[var4];
            System.out.println(i + " ");
        }

        System.out.println();
        arr[0] = 70;
        System.out.println(arr[0]);
        int[] brr = Arrays.copyOf(arr, arr.length);
        int[] crr = new int[arr.length];

        for(i = 0; i < crr.length; ++i) {
            crr[i] = arr[i];
        }

        crr[0] = 100;
        System.out.println(arr[0]);
    }
}
