package MultiDimensionalArray1;


public class booleanpalindrome{
    public static void main(String[] args) {
        int x = 121;
        boolean isPalindrome = isPalindrome(x);
        System.out.println("Is " + x + " a palindrome? " + isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        int org = x;

        int rev;
        for(rev = 0; org > 0; org /= 10) {
            int unit = org % 10;
            rev = 10 * rev + unit;
        }

        return rev == x;
    }
}

