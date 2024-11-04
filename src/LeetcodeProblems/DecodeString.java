package LeetcodeProblems;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        DecodeString obj = new DecodeString();
        String encodedString1 = "3[a]2[bc]";
        String encodedString2 = "3[a2[c]]";
        String encodedString3 = "2[abc]3[cd]ef";

        System.out.println("Decoded string1: " + obj.decodeString(encodedString1)); // Expected output: "aaabcbc"
        System.out.println("Decoded string2: " + obj.decodeString(encodedString2)); // Expected output: "accaccacc"
        System.out.println("Decoded string3: " + obj.decodeString(encodedString3)); // Expected output: "abcabccdcdcdef"
    }

    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String result = "";
        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = count * 10 + (s.charAt(index) - '0');
                    index++;
                }
                countStack.push(count);
            } else if (s.charAt(index) == '[') {
                resultStack.push(result);
                result = "";
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    temp.append(result);
                }
                result = temp.toString();
                index++;
            } else {
                result += s.charAt(index);
                index++;
            }
        }

        return result;
    }
}

