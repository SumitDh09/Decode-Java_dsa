package  Stack;

import java.util.*;

public class InfixUsingBrackets {
    public static int evaluate(String expression) {
        char[] tokens = expression.toCharArray();

        // Stack for numbers
        Stack<Integer> values = new Stack<>();

        // Stack for operators
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers
            if (tokens[i] >= '0' && tokens[i] <= '9') {
                StringBuilder sbuf = new StringBuilder();
                // There may be more than one digits in number
                while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9')
                    sbuf.append(tokens[i++]);
                values.push(Integer.parseInt(sbuf.toString()));
                i--;
            }

            // Current token is an opening brace, push it to 'operators'
            else if (tokens[i] == '(')
                operators.push(tokens[i]);

                // Closing brace encountered, solve entire brace
            else if (tokens[i] == ')') {
                while (operators.peek() != '(')
                    values.push(applyOp(operators.pop(), values.pop(), values.pop()));
                operators.pop();
            }

            // Current token is an operator
            else if (tokens[i] == '+' || tokens[i] == '-' ||
                    tokens[i] == '*' || tokens[i] == '/') {
                // While top of 'operators' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'operators'
                // to top two elements in values stack
                while (!operators.empty() && hasPrecedence(tokens[i], operators.peek()))
                    values.push(applyOp(operators.pop(), values.pop(), values.pop()));

                // Push current token to 'operators'
                operators.push(tokens[i]);
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // operators to remaining values
        while (!operators.empty())
            values.push(applyOp(operators.pop(), values.pop(), values.pop()));

        // Top of 'values' contains result, return it
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a' and 'b'.
    public static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(InfixUsingBrackets.evaluate("10 + 2 * 6"));
        System.out.println(InfixUsingBrackets.evaluate("100 * 2 + 12"));
        System.out.println(InfixUsingBrackets.evaluate("100 * ( 2 + 12 )"));
        System.out.println(InfixUsingBrackets.evaluate("100 * ( 2 + 12 ) / 14"));
    }
}
