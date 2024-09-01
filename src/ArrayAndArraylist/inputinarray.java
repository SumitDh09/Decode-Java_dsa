package ArrayAndArraylist;

import java.util.Scanner;

public class inputinarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        int i;
        for(i = 0; i <= 6; ++i) {
            arr[i] = sc.nextInt();
        }

        for(i = 0; i <= 6; ++i) {
            System.out.println(arr[i] + " ");
        }

    }
}
