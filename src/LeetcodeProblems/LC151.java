package LeetcodeProblems;

public class LC151 {
    public static void main(String[] args) {
        LC151 solution = new LC151();
        String input = "  the sky is blue  ";
        String result = solution.reverseWords(input);
        System.out.println(result);
        // Output: "blue is sky the"
    }

    // reverse function
    private void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    public String reverseWords(String s) {
        s = s.strip(); // remove all leading and trailing spaces
        StringBuilder sb = new StringBuilder(s).reverse();
        for (int i = 0; i < sb.length(); i++) {
            int j = i;
            while (i < sb.length() && sb.charAt(i) != ' ') {
                i++; // moving i till space is found
            }
            int e = i - 1;
            // go back to where there was a letter
            reverse(sb, j, e);
            // got both index and reversed
        }
        // replace all spaces with single space
        return sb.toString().replaceAll(" +", " ");
    }
}
