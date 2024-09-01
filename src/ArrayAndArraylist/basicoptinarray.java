package ArrayAndArraylist;


import java.util.Arrays;

public class basicoptinarray {


    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 45, 2, 65, 95};

        int i;
        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        for(i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
