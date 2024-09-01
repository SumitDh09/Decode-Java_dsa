package ArrayAndArraylist;


import java.util.Arrays;

public class foreachloopbasicofarray {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 45, 2, 65, 95};
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int ele = var2[var4];
            System.out.println(ele + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        for(int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
