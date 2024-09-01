package BasicSortingAlgorithms;

public class CheckIFArrayIsSortedOrNot {
    public static void main(String[] args) {
       int[] arr={1,7,3,8,12};

        int n= arr.length;
        boolean flag = true;
        // True means Sorted
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+i]){
                flag = false;
                //False means unsorted
                break;

            }

        }
        if(flag)
            System.out.println("Sorted");
        else
            System.out.println("unsorted");
    }
}
