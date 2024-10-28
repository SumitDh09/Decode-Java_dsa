package LeetcodeProblems;

class RemovingStarsFromAString {
    public static void main(String[] args) {
        RemovingStarsFromAString obj = new RemovingStarsFromAString();
        String testString = "leet**cod*e";
        String result = obj.removeStars(testString);
        System.out.println("Resulting string: " + result); // Expected output: "lecoe"
    }

    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        for (final char c : s.toCharArray()) {
            if (c == '*') {
                sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
