package MultiDimensionalArray1;

public class ArraySumdouble {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 3, 1, 0, 5, 2, 6};
        int x = 9;
        int n = arr.length;

        for(int i = 0; i < n; ++i) {
            for(int j = i + 1; j < n; ++j) {
                if (arr[i] + arr[j] == x) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }

    }
}
