package LeetcodeProblems;

class shortestPalindrome {
    public String makePalindrome(String s) {
        int length = s.length();
        if (length == 0)
            return s;
        int left = 0;
        for (int right = length - 1; right >= 0; right--) {
            if (s.charAt(right) == s.charAt(left)) {
                left++;
            }
        }
        if (left == length)
            return s;
        String nonPalindromeSuffix = s.substring(left);
        StringBuilder reverseSuffix = new StringBuilder(nonPalindromeSuffix).reverse();
        return reverseSuffix.append(makePalindrome(s.substring(0, left))).append(nonPalindromeSuffix).toString();
    }

    public static void main(String[] args) {
        shortestPalindrome solution = new shortestPalindrome();
        String input = "abcd";
        String result = solution.makePalindrome(input);
        System.out.println("Shortest palindrome: " + result);
    }
}
