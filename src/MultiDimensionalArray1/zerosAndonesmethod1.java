package MultiDimensionalArray1;


import java.util.Arrays;

public class zerosAndonesmethod1 {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 0, 0, 1, 1, 1, 0, 0, 1};

        int i;
        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " , ");
        }

        Arrays.sort(arr);

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}

