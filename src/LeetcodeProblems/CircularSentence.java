package LeetcodeProblems;

public class CircularSentence {
    public static void main(String[] args) {
        CircularSentence obj = new CircularSentence();
        String sentence1 = "leetcode exercises sound delightful";
        String sentence2 = "eetcode";
        String sentence3 = "Leetcode is cool";

        System.out.println("Is sentence1 circular? " + obj.isCircularSentence(sentence1)); // Expected output: true
        System.out.println("Is sentence2 circular? " + obj.isCircularSentence(sentence2)); // Expected output: true
        System.out.println("Is sentence3 circular? " + obj.isCircularSentence(sentence3)); // Expected output: false
    }

    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int n = words.length;

        for (int i = 0; i < n; i++) {
            char lastChar = words[i].charAt(words[i].length() - 1);
            char firstChar = words[(i + 1) % n].charAt(0);
            if (lastChar != firstChar) {
                return false;
            }
        }
        return true;
    }
}
