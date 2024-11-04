package LeetcodeProblems;

public class StringCompressor {

//    Lc  String compressor III
    public static void main(String[] args) {
        StringCompressor obj = new StringCompressor();
        String word1 = "abcde";
        String word2 = "aaaaaaaaaaaaaabb";

        System.out.println("Compressed word1: " + obj.compressString(word1)); // Expected output: "1a1b1c1d1e"
        System.out.println("Compressed word2: " + obj.compressString(word2)); // Expected output: "9a5a2b"
    }

    public String compressString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;
        while (i < word.length()) {
            char c = word.charAt(i);
            int count = 0;
            while (i < word.length() && word.charAt(i) == c && count < 9) {
                count++;
                i++;
            }
            comp.append(count).append(c);
        }
        return comp.toString();
    }
}
