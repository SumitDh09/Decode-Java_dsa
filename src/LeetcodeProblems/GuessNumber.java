package LeetcodeProblems;

/**
 * Forward declaration of guess API.
 * (The problem description is not clear, so I translate it into follows.)
 *
 *
 * @return -1 if guess num >  target num
 *          0 if guess num == target num
 *          1 if guess num <  target num
 */
abstract sealed class GuessGame {
    abstract int guess(int num);
}

public non-sealed class GuessNumber extends GuessGame {
    private int target;

    public GuessNumber(int target) {
        this.target = target;
    }

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(6); // set the target number
        int result = game.guessNumber(10); // guess range from 1 to 10
        System.out.println("The guessed number is: " + result);
    }

    @Override
    int guess(int num) {
        if (num > target) return -1;
        if (num < target) return 1;
        return 0;
    }

    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        // Find the first guess number that >= the target number
        while (l < r) {
            final int m = l + (r - l) / 2;
            if (guess(m) <= 0) // -1, 0
                r = m;
            else
                l = m + 1;
        }
        return l;
    }
}
