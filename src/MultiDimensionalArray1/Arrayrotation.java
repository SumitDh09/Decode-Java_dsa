package MultiDimensionalArray1;


public class Arrayrotation {

    public static void main(String[] args) {
        int[] a = new int[]{10, 20, 30, 40, 0, 45};
        int k = 7;
        int n = a.length;
        int effectiveRotation = k % n;
        int[] rotated = new int[n];

        for(int i = 0; i < n; ++i) {
            rotated[i] = a[(i + n - effectiveRotation) % n];
        }

        int[] var10 = rotated;
        int var7 = rotated.length;

        for(int var8 = 0; var8 < var7; ++var8) {
            int ele = var10[var8];
            System.out.print(ele + "  ");
        }

    }
}
