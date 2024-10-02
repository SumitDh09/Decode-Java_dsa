package Basics;

public class ArmStrong {

    public static void main(String[] args) {

        int n = 153;
        int temp = n;
        int r, sum = 0;
        // Initialize sum to 0

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }

        if (temp == sum) {
            System.out.println(temp + " is an Armstrong number.");
        } else {
            System.out.println(temp + " is not an Armstrong number.");
        }
    }
}
