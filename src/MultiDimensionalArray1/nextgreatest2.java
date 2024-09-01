package MultiDimensionalArray1;

public class nextgreatest2 {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 8, 60, 37, 2, 49, 16, 28};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;
        int nge = arr[n - 1];

        for(int i = n - 2; i >= 0; --i) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        int[] var9 = arr;
        int var6 = arr.length;

        int var7;
        int ele;
        for(var7 = 0; var7 < var6; ++var7) {
            ele = var9[var7];
            System.out.print(ele + " ");
        }

        System.out.println();
        var9 = ans;
        var6 = ans.length;

        for(var7 = 0; var7 < var6; ++var7) {
            ele = var9[var7];
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}
