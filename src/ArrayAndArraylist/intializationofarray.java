package ArrayAndArraylist;


import java.util.Scanner;

public class intializationofarray {
    public intializationofarray() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i;
        for(i = 0; i <= n - 1; ++i) {
            arr[i] = sc.nextInt();
        }

        for(i = 0; i <= n - 1; ++i) {
            System.out.println(arr[i] + " ");
        }

    }
}
