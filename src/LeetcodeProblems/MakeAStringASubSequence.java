package LeetcodeProblems;

class MakeAStringASubSequence {
    public static void main(String[] args) {
        MakeAStringASubSequence obj = new MakeAStringASubSequence();

        // Test cases
        String source1 = "abcde";
        String target1 = "ace";
        System.out.println("Can make subsequence from '" + source1 + "' to '" + target1 + "': " + obj.canMakeSubsequence(source1, target1));

        String source2 = "xyz";
        String target2 = "yza";
        System.out.println("Can make subsequence from '" + source2 + "' to '" + target2 + "': " + obj.canMakeSubsequence(source2, target2));

        String source3 = "zab";
        String target3 = "abc";
        System.out.println("Can make subsequence from '" + source3 + "' to '" + target3 + "': " + obj.canMakeSubsequence(source3, target3));

        String source4 = "abc";
        String target4 = "abcd";
        System.out.println("Can make subsequence from '" + source4 + "' to '" + target4 + "': " + obj.canMakeSubsequence(source4, target4));

        String source5 = "aceg";
        String target5 = "abc";
        System.out.println("Can make subsequence from '" + source5 + "' to '" + target5 + "': " + obj.canMakeSubsequence(source5, target5));
    }

//    Greedy Two Pointers
    public boolean canMakeSubsequence(String source, String target) {
        int targetIdx = 0, targetLen = target.length();
        for (char currChar : source.toCharArray()) {
            if (targetIdx < targetLen && (target.charAt(targetIdx) - currChar + 26) % 26 <= 1) {
                targetIdx++;
            }
        }
        return targetIdx == targetLen;
    }
}