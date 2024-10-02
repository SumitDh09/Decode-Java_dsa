package Basics;


public class ArmstrongusingArray {

    public static void main(String[] args) {
        int[] numbers = {153, 9474, 123, 370, 407};

        for (int n : numbers) {
            int temp = n;
            int r, sum = 0;

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
}
