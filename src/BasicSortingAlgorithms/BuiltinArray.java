package BasicSortingAlgorithms;

import java.util.Arrays;

public class BuiltinArray {
    public static void main(String[] args) {
        int[] arr={7,1,8,4,-4};
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        Arrays.sort(arr); // Built in sort method
    }
}
