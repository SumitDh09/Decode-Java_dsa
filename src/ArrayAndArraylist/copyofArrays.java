package ArrayAndArraylist;

public class copyofArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 45, 2, 65, 95};
        int[] var2 = arr;
        int var3 = arr.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            int ele = var2[var4];
            System.out.println(ele + " ");
        }

        System.out.println();
        arr[0] = 70;
        System.out.println(arr[0]);
    }
}
