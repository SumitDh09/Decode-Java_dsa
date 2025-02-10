package LeetcodeProblems;

public class ClearDigits {
    public static void main(String[] args) {
        ClearDigits cd = new ClearDigits();

        String s1 = "ab2c3";
        System.out.println(cd.clearDigits(s1)); // Output: "a"

        String s2 = "cb34";
        System.out.println(cd.clearDigits(s2)); // Output: ""

        String s3 = "abc";
        System.out.println(cd.clearDigits(s3)); // Output: "abc"

        String s4 = "4abc5d6";
        System.out.println(cd.clearDigits(s4)); // Output: "ab"
    }

    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1); // Remove last char
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
