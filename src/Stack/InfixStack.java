package Stack;

import java.util.*;

public class InfixStack {

    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        System.out.println("Expression: " + str);

        Stack<Integer> num = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If the character is a digit, push it to the number stack
            if (Character.isDigit(ch)) {
                num.push(ch - '0'); // Convert char to int
            } else {
                // While the operator stack is not empty and the precedence of the current operator is less than or equal to the precedence of the operator at the top of the stack
                while (!op.isEmpty() && precedence(op.peek()) >= precedence(ch)) {
                    int v2 = num.pop();
                    int v1 = num.pop();
                    char operator = op.pop();
                    num.push(applyOperator(v1, v2, operator));
                }
                op.push(ch); // Push the current operator onto the stack
            }
        }

        // Process remaining operators in the stack
        while (!op.isEmpty()) {
            int v2 = num.pop();
            int v1 = num.pop();
            char operator = op.pop();
            num.push(applyOperator(v1, v2, operator));
        }

        System.out.println("Result: " + num.peek());
    }

    // Function to apply an operator to two operands
    private static int applyOperator(int v1, int v2, char operator) {
        switch (operator) {
            case '+':
                return v1 + v2;
            case '-':
                return v1 - v2;
            case '*':
                return v1 * v2;
            case '/':
                return v1 / v2;
        }
        return 0;
    }

    // Function to return the precedence of operators
    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return 0;
    }
}