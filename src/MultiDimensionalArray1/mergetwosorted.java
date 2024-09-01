package MultiDimensionalArray1;

public class mergetwosorted {

    public static void main(String[] args) {
        int[] a = new int[]{11, 25, 33, 74};
        int[] b = new int[]{26, 54, 87, 39};
        int m = a.length;
        int n = b.length;
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                ++i;
                ++k;
            } else {
                c[k] = b[j];
                ++j;
                ++k;
            }

            if (i == a.length) {
                while(j < b.length) {
                    c[k] = b[j];
                    ++j;
                    ++k;
                }
            }

            if (i == a.length) {
                while(j < b.length) {
                    c[k] = b[j];
                    ++j;
                    ++k;
                }
            }
        }

        int[] var9 = c;
        int var10 = c.length;

        for(int var11 = 0; var11 < var10; ++var11) {
            int ele = var9[var11];
            System.out.println(ele + " ");
        }

    }
}
