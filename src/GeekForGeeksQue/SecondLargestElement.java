package GeekForGeeksQue;


public class SecondLargestElement {
    public static void main(String[] args) {
        SecondLargestElement obj = new SecondLargestElement();
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        System.out.println("Second largest element in arr1 : " + obj.getSecondLargest(arr1));
        // Expected output: 34

        int[] arr2 = {10, 5, 10};
        System.out.println("Second largest element in arr2 : " + obj.getSecondLargest(arr2));
        // Expected output: 5

        int[] arr3 = {10, 10, 10};
        System.out.println("Second largest element in arr3 : " + obj.getSecondLargest(arr3));
        // Expected output: -1
    }

    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // If there are fewer than 2 elements, return -1
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}

