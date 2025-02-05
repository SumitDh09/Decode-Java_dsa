package LeetcodeProblems;

public class CheckIfOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        CheckIfOneStringSwapCanMakeStringsEqual solution = new CheckIfOneStringSwapCanMakeStringsEqual();

        String s1 = "bank";
        String s2 = "kanb";

        System.out.println(solution.areAlmostEqual(s1, s2)); // Output should be true
    }

    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int firstIndex = -1, secondIndex = -1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstIndex == -1) {
                    firstIndex = i;
                } else if (secondIndex == -1) {
                    secondIndex = i;
                } else {
                    return false; // More than two differences
                }
            }
        }

        if (secondIndex == -1) {
            return false; // Less than two differences
        }

        return s1.charAt(firstIndex) == s2.charAt(secondIndex) && s1.charAt(secondIndex) == s1.charAt(firstIndex);
    }
}

