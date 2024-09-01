package MultiDimensionalArray1;
public  class Twopointers{

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 0, 45};
        int n = arr.length;
        int[] var3 = arr;
        int j = arr.length;

        int temp;
        int ele;
        for(temp = 0; temp < j; ++temp) {
            ele = var3[temp];
            System.out.print(ele + " ");
        }

        System.out.println();

        for(int i = 0; i < n / 2; ++i) {
            j = n - 1 - i;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        var3 = arr;
        j = arr.length;

        for(temp = 0; temp < j; ++temp) {
            ele = var3[temp];
            System.out.print(ele + " ");
        }

    }
}
