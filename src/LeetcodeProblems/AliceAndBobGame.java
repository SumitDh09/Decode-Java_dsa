package LeetcodeProblems;

public class AliceAndBobGame {
    public static void main(String[] args) {
        System.out.println(canAliceWin(12));
        // Output: true
        System.out.println(canAliceWin(1));
        // Output: false
        System.out.println(canAliceWin(20));
        // Output: true
        System.out.println(canAliceWin(15));
        // Output: true
        System.out.println(canAliceWin(9));
        // Output: false
    }

    public static boolean canAliceWin(int n) {
        // If n is less than 10, Alice cannot make her first move
        if (n < 10) {
            return false;
        }

        // Calculate the remaining stones after Alice's first move
        int remainingStones = n - 10;

        // If remaining stones are less than 9, Bob cannot make a valid move
        if (remainingStones < 9) {
            return true;
        }

        // If remaining stones are 9 or more, we need to simulate the game
        // The game alternates between Alice and Bob, reducing the number of stones
        // Each player will remove stones until one cannot make a valid move
        // We can simulate this by checking the number of stones left after each turn
        int stones = remainingStones;
        int turn = 9; // Bob's first turn will be to remove 9 stones

        while (stones >= 0) {
            stones -= turn; // Current player removes 'turn' stones
            turn--; // Next player will remove one less stone
            if (turn < 0) {
                // If turn goes below 0, it means the last player could not make a move
                return true; // Alice wins
            }
        }

        return false; // If we exit the loop, Alice loses
    }
}