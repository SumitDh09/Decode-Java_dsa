package LeetcodeProblems;

class StringCompressorII {

    //  LC   String compressor III
    public static void main(String[] args) {
        StringCompressorII obj = new StringCompressorII();
        String word1 = "abcde";
        String word2 = "aaaaaaaaaaaaaabb";

        System.out.println("Compressed word1: " + obj.compressedString(word1)); // Expected output: "1a1b1c1d1e"
        System.out.println("Compressed word2: " + obj.compressedString(word2)); // Expected output: "9a5a2b"
    }

    public String compressedString(String word) {
        final int n = word.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0, j = 0; i < n; i = j) {
            int count = 0;
            while (j < n && word.charAt(j) == word.charAt(i) && count < 9) {
                ++j;
                ++count;
            }
            sb.append(String.valueOf(count)).append(word.charAt(i));
        }

        return sb.toString();
    }
}
