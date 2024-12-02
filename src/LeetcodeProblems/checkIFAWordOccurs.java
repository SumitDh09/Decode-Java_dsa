package LeetcodeProblems;

public class checkIFAWordOccurs {
    public static void main(String[] args) {
        checkIFAWordOccurs solution = new checkIFAWordOccurs();

        String sentence1 = "i love eating burger";
        String searchWord1 = "burg";
        System.out.println("Prefix found at position: " + solution.isPrefixOfWord(sentence1, searchWord1)); // Expected output: 4

        String sentence2 = "this problem is an easy problem";
        String searchWord2 = "pro";
        System.out.println("Prefix found at position: " + solution.isPrefixOfWord(sentence2, searchWord2)); // Expected output: 2

        String sentence3 = "i am tired";
        String searchWord3 = "you";
        System.out.println("Prefix found at position: " + solution.isPrefixOfWord(sentence3, searchWord3)); // Expected output: -1
    }

    public int isPrefixOfWord(String sentence, String searchWord) {
        // form an array
        String words[] = sentence.split(" ");
        int m = searchWord.length();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            if (words[i].length() >= searchWord.length()) {
                if (words[i].substring(0, m).equals(searchWord)) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
}

