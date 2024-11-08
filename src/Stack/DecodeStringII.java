package Stack;

import java.util.Stack;

public class DecodeStringII {
    public static void main(String[] args) {
        DecodeStringII obj = new DecodeStringII();
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";

        System.out.println("Decoded string for s1: " + obj.decodeString(s1)); // Expected output: "aaabcbc"
        System.out.println("Decoded string for s2: " + obj.decodeString(s2)); // Expected output: "accaccacc"
        System.out.println("Decoded string for s3: " + obj.decodeString(s3)); // Expected output: "abcabccdcdcdef"
    }

    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                st.push(ch);
            } else {
                // get the substring
                StringBuilder sb = new StringBuilder();
                while (st.peek() != '[') {
                    sb.append(st.pop());
                }
                // remove '['
                st.pop();
                // now get the number
                int k = 0;
                int base = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    k = (st.pop() - '0') * base + k;
                    base *= 10;
                }
                // push the decoded string back to the stack
                while (k-- > 0) {
                    for (int i = sb.length() - 1; i >= 0; i--) {
                        st.push(sb.charAt(i));
                    }
                }
            }
        }

        // build the final result
        char[] result = new char[st.size()];
        for (int i = st.size() - 1; i >= 0; i--) {
            result[i] = st.pop();
        }
        return new String(result);
    }
}
