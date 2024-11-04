package LeetcodeProblems;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        AsteroidCollision obj = new AsteroidCollision();
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};

        System.out.println("Result for asteroids1: " + Arrays.toString(obj.asteroidCollision(asteroids1))); // Expected output: [5, 10]
        System.out.println("Result for asteroids2: " + Arrays.toString(obj.asteroidCollision(asteroids2))); // Expected output: []
        System.out.println("Result for asteroids3: " + Arrays.toString(obj.asteroidCollision(asteroids3))); // Expected output: [10]
    }

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            boolean exploded = false;
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                if (stack.peek() < -asteroid) {
                    stack.pop();
                    continue;
                } else if (stack.peek() == -asteroid) {
                    stack.pop();
                }
                exploded = true;
                break;
            }
            if (!exploded) {
                stack.push(asteroid);
            }
        }
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return result;
    }
}
