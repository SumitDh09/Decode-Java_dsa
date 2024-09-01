package MultiDimensionalArray1;

public class zeroandonesmethod3 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 1, 1, 0, 0, 0, 1, 0};
        int n = arr.length;
        int noOfZeros = 0;

        int i;
        for(i = 0; i < n; ++i) {
            if (arr[i] == 0) {
                ++noOfZeros;
            }
        }

        for(i = 0; i < n; ++i) {
            if (i < noOfZeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }

        int[] var8 = arr;
        int var5 = arr.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            int ele = var8[var6];
            System.out.print(ele + " ");
        }

        System.out.println();
    }
}

