package Binarysearch;
class ReverseSortedArrayBS{
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        ReverseSortedArrayBS main = new ReverseSortedArrayBS();
        int result = main.search(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public int search(int [] arr, int target){
        int n = arr.length;
        int lo=0,hi=n-1;
        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<=arr[hi]){
                if (target>arr[mid] && target <= arr[hi])
                    lo = mid +1;
                else
                    hi = mid -1;

            }
            else{
                if (target > arr[lo] && target < arr[mid])
                    hi=mid-1;
                else
                    lo=mid+1;


            }


        }
        return -1;
    }

}
