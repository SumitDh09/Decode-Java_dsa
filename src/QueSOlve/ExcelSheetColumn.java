package QueSOlve;

class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            int r = (columnNumber - 1) % 26;
            sb.append((char) (r + 'A'));
            columnNumber = (columnNumber - 1) / 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int columnNumber = 28; // Example input
        String result = solution.convertToTitle(columnNumber);
        System.out.println("Column Title: " + result); // Expected output: "AB"
    }
}
