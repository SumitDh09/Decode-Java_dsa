package Stack;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String str = "8-(5+3)*(4/6)";
        System.out.println("Infix Expression: " + str);

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch + "");

            } else if (ch == ')') {
                op.push(ch);

            } else if (ch == '(') {
                while (!op.isEmpty() && op.peek() != ')') {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 +o;
                    val.push(t);
                }
                op.pop(); // pop the ')'

            } else {
                while (!op.isEmpty() && precedence(op.peek()) > precedence(ch)) {
                    String v1 = val.pop();
                    String v2 = val.pop();
                    char o = op.pop();
                    String t = v1 + v2 +o;
                    val.push(t);
                }
                op.push(ch);
            }
        }

        while (!op.isEmpty()) {
            String v1 = val.pop();
            String v2 = val.pop();
            char o = op.pop();
            String t = v1 + v2 +o;
            val.push(t);
        }

        System.out.println("Postfix Expression: " + val.peek());
    }

    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}



