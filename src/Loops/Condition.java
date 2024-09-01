package Loops;

public class Condition {
    public static void main(String[] args) {
        int x = 1;
        int y = 9;

        while(x >= 0) {
            --x;
            ++y;
            if (x != y) {
                System.out.println(x + " " + y);
            }
        }

    }
}
